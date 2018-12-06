package sn.objis.gestionbanque.presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.objis.gestionbanque.domaine.Groupe;
import sn.objis.gestionbanque.service.IServiceGroupeImpl;

/**
 * Servlet implementation class AjouterGroupeServlet
 */
public class AjouterGroupeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjouterGroupeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("JSP/employesup/addGroupe.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomGrp = request.getParameter("nomGroupe");
		
		Groupe grp = new Groupe(nomGrp);
		IServiceGroupeImpl service = new IServiceGroupeImpl();
		service.ajouter(grp);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("listeGroupe");
		rd.forward(request, response);
	}

}
