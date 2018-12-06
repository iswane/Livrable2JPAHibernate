/**
 * 
 */
package sn.objis.gestionbanque.service;

import java.util.List;

import sn.objis.gestionbanque.dao.IDaoCompteImpl;
import sn.objis.gestionbanque.domaine.Client;
import sn.objis.gestionbanque.domaine.Compte;
import sn.objis.gestionbanque.domaine.Employe;

/**
 * @author OBJIS #10000codeurs
 *
 */
public class IServiceCompteImpl implements IServiceCompte{

	private IDaoCompteImpl dao = new IDaoCompteImpl();
	

	@Override
	public List<Compte> rechercherCompteParClient(Client client) {
		return dao.findCompteByClient(client);
	}

	@Override
	public List<Compte> rechercherCompteParEmploye(Employe emp) {
		return dao.findCompteByEmploye(emp);
	}

	@Override
	public Compte ajouter(Compte t) {
		return dao.add(t);
	}

	@Override
	public List<Compte> lister() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	@Override
	public Compte rechercherParCle(long k) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Compte rechercherCompteParNumCompte(String numCompte) {
		// TODO Auto-generated method stub
		return dao.findCompteByNumCompte(numCompte);
	}

}
