package sn.objis.gestionbanque.presentation;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.objis.gestionbanque.domaine.Employe;
import sn.objis.gestionbanque.domaine.Groupe;
import sn.objis.gestionbanque.service.IServiceEmployeImpl;
import sn.objis.gestionbanque.service.IServiceGroupeImpl;

/**
 * Servlet implementation class ListeEmployeServlet
 */
public class ListeEmployeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListeEmployeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		IServiceEmployeImpl serviceEmploye = new IServiceEmployeImpl();
		IServiceGroupeImpl serviceGroupe = new IServiceGroupeImpl();
		List<Groupe> listeGroupes = serviceGroupe.lister();
		List<Employe> listeEmployes = serviceEmploye.lister();
		
		request.setAttribute("listeEmploye", listeEmployes);
		request.setAttribute("listeGroupe", listeGroupes);

		RequestDispatcher rd = request.getRequestDispatcher("JSP/employesup/listeEmploye.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
