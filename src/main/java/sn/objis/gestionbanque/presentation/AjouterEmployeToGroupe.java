package sn.objis.gestionbanque.presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.objis.gestionbanque.service.IServiceEmployeImpl;

/**
 * Servlet implementation class AjouterEmployeToGroupe
 */
public class AjouterEmployeToGroupe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjouterEmployeToGroupe() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IServiceEmployeImpl serviceEmploye = new IServiceEmployeImpl();
		
		long idEmp = Long.parseLong(request.getParameter("idEmp"));
		long idGrp = Long.parseLong(request.getParameter("idGrp"));
		serviceEmploye.addEmpToGroupe(idGrp, idEmp);
		
		RequestDispatcher rd = request.getRequestDispatcher("listeEmploye");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
	}

}
