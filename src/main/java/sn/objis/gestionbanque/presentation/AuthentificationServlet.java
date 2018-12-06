package sn.objis.gestionbanque.presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sn.objis.gestionbanque.domaine.CompteUser;
import sn.objis.gestionbanque.domaine.Employe;
import sn.objis.gestionbanque.service.IServiceCompteUserImpl;
import sn.objis.gestionbanque.service.IServiceEmployeImpl;

/**
 * Servlet implementation class AuthentificationServlet
 */
@WebServlet("/authentification")
public class AuthentificationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public enum roles {
		admin, employeSup, employe;
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AuthentificationServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		IServiceCompteUserImpl serviceCompteUser = new IServiceCompteUserImpl();
		IServiceEmployeImpl serviceEmploye = new IServiceEmployeImpl();

		// Récuperation des paramètres
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		RequestDispatcher rd;
		try {
			// Soummissions des informations au serveur d'application pour
			// l'authentification
			
			CompteUser cUser = serviceCompteUser.rechercherCompteUser(login, password);
			long id = cUser.getId();
			Employe employe = serviceEmploye.rechercherEmployeParIdUser(id);
			request.login(login, password);
			// Redirection vers l'espace de travail de l'utilisateur
			if (request.isUserInRole(roles.admin.toString())) {
				HttpSession session = request.getSession(true);
				
				session.setAttribute("session", cUser);
				session.setAttribute("employe", employe);
				
				rd = request.getRequestDispatcher("admin");
				rd.forward(request, response);
			} else if (request.isUserInRole(roles.employeSup.toString())) {
				HttpSession session = request.getSession();
				
				session.setAttribute("session", cUser);
				session.setAttribute("employe", employe);
				
				rd = request.getRequestDispatcher("manager");
				rd.forward(request, response);
			} else if (request.isUserInRole(roles.employe.toString())) {
				HttpSession session = request.getSession();
				
				session.setAttribute("session", cUser);
				session.setAttribute("employe", employe);
				
				rd = request.getRequestDispatcher("JSP/employe/formulaire.jsp");
				rd.forward(request, response);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erreur d'authentification");
			rd = request.getRequestDispatcher("index.jsp");
			rd.include(request, response);
		}
	}

}
