/**
 * 
 */
package sn.objis.gestionbanque.dao;



import sn.objis.gestionbanque.domaine.Employe;
import sn.objis.gestionbanque.domaine.Groupe;

/**
 * @author OBJIS #10000codeurs
 *
 */
public interface IDaoEmploye extends IDao<Employe, Integer>{

	public void addEmpToGroupe(long idGrpe, long idEmp);
	
	public Employe findEmpByGroupe(Groupe groupe);
	
	public Employe findEmpById(long id);
	
	public Employe findEmployeByIdUser(long idUser);
	
}
