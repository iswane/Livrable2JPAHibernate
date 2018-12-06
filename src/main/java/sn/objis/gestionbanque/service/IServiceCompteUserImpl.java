/**
 * 
 */
package sn.objis.gestionbanque.service;

import java.util.List;

import sn.objis.gestionbanque.dao.IDaoCompteUserImpl;
import sn.objis.gestionbanque.domaine.CompteUser;

/**
 * @author OBJIS #10000codeurs
 *
 */
public class IServiceCompteUserImpl implements IServiceCompteUser {

	private IDaoCompteUserImpl dao = new IDaoCompteUserImpl();

	@Override
	public CompteUser ajouter(CompteUser t) {
		dao.add(t);
		return t;
	}

	@Override
	public List<CompteUser> lister() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CompteUser rechercherParCle(long k) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CompteUser rechercherCompteUser(String login, String password) {
		// TODO Auto-generated method stub
		return dao.findCompteUser(login, password);
	}

}
