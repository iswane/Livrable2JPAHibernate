package sn.objis.gestionbanque.service;

import java.util.List;

import sn.objis.gestionbanque.dao.IDaoRolesImpl;
import sn.objis.gestionbanque.domaine.Roles;

public class IServiceRolesImpl implements IServiceRoles{

	IDaoRolesImpl dao = new IDaoRolesImpl();
	
	@Override
	public Roles ajouter(Roles t) {
		dao.add(t);
		return t;
	}

	@Override
	public List<Roles> lister() {
		return dao.getAll();
	}

	@Override
	public Roles rechercherParCle(long k) {
		return null;
	}

}
