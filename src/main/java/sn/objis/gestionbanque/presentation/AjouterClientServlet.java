package sn.objis.gestionbanque.presentation;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sn.objis.gestionbanque.domaine.Client;
import sn.objis.gestionbanque.domaine.CompteCourant;
import sn.objis.gestionbanque.domaine.CompteEpargne;
import sn.objis.gestionbanque.domaine.CompteUser;
import sn.objis.gestionbanque.domaine.Employe;
import sn.objis.gestionbanque.service.IServiceClientImpl;
import sn.objis.gestionbanque.service.IServiceCompteImpl;
import sn.objis.gestionbanque.service.IServiceEmployeImpl;

/**
 * Servlet implementation class AjouterClientServlet
 */
public class AjouterClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AjouterClientServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		HttpSession session = request.getSession(true);
//		Employe employe = (Employe) session.getAttribute("employe");
		RequestDispatcher rd = request.getRequestDispatcher("JSP/employe/addClient.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		IServiceClientImpl serviceClient = new IServiceClientImpl();
		IServiceCompteImpl serviceCompte = new IServiceCompteImpl();
		IServiceEmployeImpl serviceEmp = new IServiceEmployeImpl();

		HttpSession session = request.getSession(true);

		CompteUser cUser = (CompteUser) session.getAttribute("session");

		long idUser = cUser.getId();

		Employe emp = serviceEmp.rechercherEmployeParIdUser(idUser);

		String compte = request.getParameter("compte");
		String numCompte = request.getParameter("numCompte");
		double solde = Double.parseDouble(request.getParameter("solde"));
		double tauxdecouvert = Double.parseDouble(request.getParameter("tauxDecouvert"));
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		Date date = new Date();
		

		if (compte.equalsIgnoreCase("courant")) {
			CompteCourant cc = new CompteCourant(numCompte, date, solde, tauxdecouvert);
			Client client = new Client(nom, prenom);
			serviceClient.ajouter(client);
			cc.setClient(client);
			cc.setEmploye(emp);
			serviceCompte.ajouter(cc);
		} else {
			CompteEpargne ce = new CompteEpargne(numCompte, date, solde, tauxdecouvert);
			Client client = new Client(nom, prenom);
			serviceClient.ajouter(client);
			ce.setClient(client);
			ce.setEmploye(emp);
			serviceCompte.ajouter(ce);
		}

		RequestDispatcher rd = request.getRequestDispatcher("listeClient");
		rd.forward(request, response);

	}

}
