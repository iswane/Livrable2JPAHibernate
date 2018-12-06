/**
 * 
 */
package sn.objis.gestionbanque.service;


import sn.objis.gestionbanque.domaine.Employe;
import sn.objis.gestionbanque.domaine.Groupe;

/**
 * @author OBJIS #10000codeurs
 *
 */
public interface IServiceEmploye extends IService<Employe>{

	public void addEmpToGroupe(long idGrpe, long idEmp);
	
	public Employe rechercherEmpParGroupe(Groupe groupe);
	
	public Employe rechercherParId(long id);
	
	public Employe rechercherEmployeParIdUser(long idUser);
	
}
