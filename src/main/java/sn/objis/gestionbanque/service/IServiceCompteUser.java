/**
 * 
 */
package sn.objis.gestionbanque.service;

import sn.objis.gestionbanque.domaine.CompteUser;

/**
 * @author OBJIS #10000codeurs
 *
 */
public interface IServiceCompteUser extends IService<CompteUser>{

	public CompteUser rechercherCompteUser(String login, String password);
	
}
