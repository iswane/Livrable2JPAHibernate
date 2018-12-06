/**
 * 
 */
package sn.objis.gestionbanque.service;

import java.util.List;

import sn.objis.gestionbanque.domaine.Client;
import sn.objis.gestionbanque.domaine.Compte;
import sn.objis.gestionbanque.domaine.Employe;

/**
 * @author OBJIS #10000codeurs
 *
 */
public interface IServiceCompte extends IService<Compte>{

	public List<Compte> rechercherCompteParClient(Client client);

	public List<Compte> rechercherCompteParEmploye(Employe emp);
	
	public Compte rechercherCompteParNumCompte(String numCompte);
}
