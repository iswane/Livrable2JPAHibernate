package sn.objis.gestionbanque.presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.objis.gestionbanque.domaine.Compte;
import sn.objis.gestionbanque.service.IServiceCompteImpl;

/**
 * Servlet implementation class ProfilClientServlet
 */
public class ProfilClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProfilClientServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		IServiceCompteImpl serviceCompte = new IServiceCompteImpl();
		long idCompte = Long.parseLong(request.getParameter("idCompte"));
		Compte cpte = serviceCompte.rechercherParCle(idCompte);

		request.setAttribute("compte", cpte);
		RequestDispatcher rd = request.getRequestDispatcher("JSP/employe/profilClient.jsp");
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
