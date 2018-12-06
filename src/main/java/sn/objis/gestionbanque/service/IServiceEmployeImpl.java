/**
 * 
 */
package sn.objis.gestionbanque.service;

import java.util.List;

import sn.objis.gestionbanque.dao.IDaoEmployeImpl;
import sn.objis.gestionbanque.domaine.Employe;
import sn.objis.gestionbanque.domaine.Groupe;

/**
 * @author OBJIS #10000codeurs
 *
 */
public class IServiceEmployeImpl implements IServiceEmploye{

	private IDaoEmployeImpl dao = new IDaoEmployeImpl();
	

	@Override
	public Employe rechercherEmpParGroupe(Groupe groupe) {
		return dao.findEmpByGroupe(groupe);
	}


	@Override
	public Employe ajouter(Employe t) {
		dao.add(t);
		return t;
	}


	@Override
	public List<Employe> lister() {
		return dao.getAll();
	}


	@Override
	public Employe rechercherParCle(long k) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Employe rechercherParId(long id) {
		// TODO Auto-generated method stub
		return dao.findEmpById(id);
	}


	@Override
	public Employe rechercherEmployeParIdUser(long idUser) {
		return dao.findEmployeByIdUser(idUser);
	}


	@Override
	public void addEmpToGroupe(long idGrpe, long idEmp) {
		dao.addEmpToGroupe(idGrpe, idEmp);
	}



}
