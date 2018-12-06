package sn.objis.gestionbanque.dao;

import sn.objis.gestionbanque.domaine.Roles;

public class IDaoRolesImpl extends AbstractIDaoGeneriqueImpl<Roles, Long> implements IDaoRoles{

	public IDaoRolesImpl() {
		super(Roles.class);
	}

}
