package sn.objis.gestionbanque.presentation;

import java.io.IOException;
import java.util.List;

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
 * Servlet implementation class AjouterEmployeServlet
 */
public class AjouterEmployeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AjouterEmployeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		IServiceEmployeImpl serviceEmp = new IServiceEmployeImpl();
		List<Employe> listeEmpSup = serviceEmp.lister();
		
		request.setAttribute("listeEmpSup", listeEmpSup);
		RequestDispatcher rd = request.getRequestDispatcher("JSP/employesup/addEmploye.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		IServiceCompteUserImpl serviceCompteUser = new IServiceCompteUserImpl();
		IServiceEmployeImpl serviceEmp = new IServiceEmployeImpl();
		
		long idEmpSup = Long.parseLong(request.getParameter("idEmpSup")); 
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		String matricule = request.getParameter("matricule");
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		Employe empSup = serviceEmp.rechercherParId(idEmpSup);
		
		CompteUser cUser = new CompteUser(login, password);
		serviceCompteUser.ajouter(cUser);
		
		Employe emp = new Employe(nom, prenom, matricule);
		emp.setSupHierarchique(empSup);
		emp.setCuser(cUser);
		serviceEmp.ajouter(emp);

		RequestDispatcher rd = request.getRequestDispatcher("listeEmploye");
		rd.forward(request, response);
	}

}
