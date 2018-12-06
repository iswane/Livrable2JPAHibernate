package sn.objis.gestionbanque.presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.objis.gestionbanque.domaine.CompteUser;
import sn.objis.gestionbanque.domaine.Employe;
import sn.objis.gestionbanque.service.IServiceCompteUserImpl;
import sn.objis.gestionbanque.service.IServiceEmployeImpl;

/**
 * Servlet implementation class AjouterManagerServlet
 */
public class AjouterManagerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AjouterManagerServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("JSP/admin/addManager.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		IServiceCompteUserImpl serviceCompteUser = new IServiceCompteUserImpl();
		IServiceEmployeImpl serviceEmploye = new IServiceEmployeImpl();
		
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		String matricule = request.getParameter("matricule");
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");

		CompteUser user = new CompteUser(login, password);
		serviceCompteUser.ajouter(user); 
		
		Employe emp = new Employe(nom, prenom, matricule);
		emp.setCuser(user);
		serviceEmploye.ajouter(emp);
		
		RequestDispatcher rd = request.getRequestDispatcher("listeEmploye");
		rd.forward(request, response);
	}

}
