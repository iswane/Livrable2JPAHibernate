package sn.objis.gestionbanque.presentation;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sn.objis.gestionbanque.domaine.Client;
import sn.objis.gestionbanque.domaine.CompteUser;
import sn.objis.gestionbanque.domaine.Employe;
import sn.objis.gestionbanque.domaine.Groupe;
import sn.objis.gestionbanque.domaine.Operation;
import sn.objis.gestionbanque.service.IServiceClientImpl;
import sn.objis.gestionbanque.service.IServiceEmployeImpl;
import sn.objis.gestionbanque.service.IServiceGroupeImpl;
import sn.objis.gestionbanque.service.IServiceOperationImpl;

/**
 * Servlet implementation class ManagerServlet
 */
public class ManagerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManagerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IServiceEmployeImpl serviceEmploye = new IServiceEmployeImpl();
		IServiceClientImpl serviceClient = new IServiceClientImpl();
		IServiceGroupeImpl serviceGroupe = new IServiceGroupeImpl();
		IServiceOperationImpl serviceOperation = new IServiceOperationImpl();
		
		HttpSession session = request.getSession(true);
		CompteUser cUser = (CompteUser) session.getAttribute("session");
		Employe employ = (Employe) session.getAttribute("employe");
		
		List<Groupe> listeGroupes = serviceGroupe.lister();
		List<Employe> listeEmployes = serviceEmploye.lister();
		List<Client> listeClients = serviceClient.lister();
		List<Operation> listeOperations = serviceOperation.lister();
		
		int sizeListeEmploye = listeEmployes.size();
		int sizeListeGroupe = listeGroupes.size();
		int sizeListeClient = listeClients.size();
		int sizeListeOperation = listeOperations.size();

		request.setAttribute("sizeListeGroupe", sizeListeGroupe);
		request.setAttribute("sizeListeClient", sizeListeClient);
		request.setAttribute("sizeListeEmploye", sizeListeEmploye);
		request.setAttribute("sizeListeOperation", sizeListeOperation);
		session.setAttribute("session", cUser);
		request.setAttribute("employe", employ);
		
		RequestDispatcher rd = request.getRequestDispatcher("JSP/employesup/manager.jsp");
		rd.forward(request, response);
	}

}
