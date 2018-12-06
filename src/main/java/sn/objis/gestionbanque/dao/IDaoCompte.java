/**
 * 
 */
package sn.objis.gestionbanque.dao;

import java.util.List;

import sn.objis.gestionbanque.domaine.Client;
import sn.objis.gestionbanque.domaine.Compte;
import sn.objis.gestionbanque.domaine.Employe;

/**
 * @author OBJIS #10000codeurs
 *
 */
public interface IDaoCompte extends IDao<Compte, Integer> {

	public List<Compte> findCompteByClient(Client client);
	
	public List<Compte> findCompteByEmploye(Employe emp);
	
	public Compte findCompteByNumCompte(String numCompte);
}
