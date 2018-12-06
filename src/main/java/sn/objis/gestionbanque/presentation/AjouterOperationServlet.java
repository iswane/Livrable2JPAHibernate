package sn.objis.gestionbanque.presentation;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sn.objis.gestionbanque.domaine.Compte;
import sn.objis.gestionbanque.domaine.Employe;
import sn.objis.gestionbanque.domaine.Retrait;
import sn.objis.gestionbanque.domaine.Versement;
import sn.objis.gestionbanque.service.IServiceCompteImpl;
import sn.objis.gestionbanque.service.IServiceOperationImpl;

/**
 * Servlet implementation class AjouterOperationServlet
 */
public class AjouterOperationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AjouterOperationServlet() {
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
		RequestDispatcher rd = request.getRequestDispatcher("JSP/employe/addOperation.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		IServiceCompteImpl serviceCompte = new IServiceCompteImpl();
		IServiceOperationImpl serviceOperation = new IServiceOperationImpl();

		Date date = new Date();
		HttpSession session = request.getSession(true);
		Employe employe = (Employe) session.getAttribute("employe");


		long numOperation = 101234567 + (long) (Math.random()*(959959123 - 101234567));
		String operation = request.getParameter("operation").toString();
		double montant = Double.parseDouble(request.getParameter("montant"));
		String numCompte = request.getParameter("numCompte");
		Compte cpte = serviceCompte.rechercherCompteParNumCompte(numCompte);
		
		if (cpte != null) {
			if (operation.equals("retrait")) {
				Retrait retrait = new Retrait(numOperation, date, montant);
				retrait.setCompte(cpte);
				retrait.setEmploye(employe);
				serviceOperation.ajouter(retrait);
			} else {
				Versement versement = new Versement(numOperation, date, montant);
				versement.setCompte(cpte);
				versement.setEmploye(employe);
				serviceOperation.ajouter(versement);
			}
		} else {
			System.out.println("Compte non trouvé !");
		}
		RequestDispatcher rd = request.getRequestDispatcher("listeOperation");
		rd.forward(request, response);
	}

}
