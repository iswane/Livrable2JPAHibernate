/**
 * 
 */
package sn.objis.gestionbanque.dao;

import sn.objis.gestionbanque.domaine.CompteUser;

/**
 * @author OBJIS #10000codeurs
 *
 */
public interface IDaoCompteUser extends IDao<CompteUser, Integer>{
	
	public CompteUser findCompteUser(String login, String password);

}
