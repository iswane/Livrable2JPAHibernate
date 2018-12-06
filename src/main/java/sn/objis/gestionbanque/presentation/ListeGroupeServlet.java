package sn.objis.gestionbanque.presentation;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sn.objis.gestionbanque.domaine.CompteUser;
import sn.objis.gestionbanque.domaine.Employe;
import sn.objis.gestionbanque.domaine.Groupe;
import sn.objis.gestionbanque.service.IServiceGroupeImpl;

/**
 * Servlet implementation class ListeGroupeServlet
 */
public class ListeGroupeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListeGroupeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		IServiceGroupeImpl serviceGroupe = new IServiceGroupeImpl();

		HttpSession session = request.getSession(true);
		CompteUser cUser = (CompteUser) session.getAttribute("session");
		Employe employe = (Employe) request.getAttribute("employe");

		List<Groupe> listeGroupes = serviceGroupe.lister();


		session.setAttribute("session", cUser);
		request.setAttribute("employe", employe);
		request.setAttribute("listeGroupe", listeGroupes);
		
		RequestDispatcher rd = request.getRequestDispatcher("JSP/employesup/listeGroupe.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
