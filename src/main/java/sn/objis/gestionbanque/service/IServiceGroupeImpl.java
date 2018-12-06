/**
 * 
 */
package sn.objis.gestionbanque.service;

import java.util.List;

import sn.objis.gestionbanque.dao.IDaoGroupeImpl;
import sn.objis.gestionbanque.domaine.Groupe;

/**
 * @author OBJIS #10000codeurs
 *
 */
public class IServiceGroupeImpl implements IServiceGroupe{

	private IDaoGroupeImpl dao = new IDaoGroupeImpl();
	
	@Override
	public Groupe ajouter(Groupe t) {
		dao.add(t);
		return t;
	}

	@Override
	public List<Groupe> lister() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	@Override
	public Groupe rechercherParCle(long k) {
		// TODO Auto-generated method stub
		return null;
	}



}
