/**
 * 
 */
package sn.objis.gestionbanque.dao;


import javax.persistence.TypedQuery;

import sn.objis.gestionbanque.domaine.CompteUser;

/**
 * @author OBJIS #10000codeurs
 *
 */
public class IDaoCompteUserImpl extends AbstractIDaoGeneriqueImpl<CompteUser, Integer> implements IDaoCompteUser {

	public IDaoCompteUserImpl() {
		super(CompteUser.class);
	}

	@Override
	public CompteUser findCompteUser(String login, String password) {
		CompteUser compte = null;
		try {

			// Traitement
			String jpql = "SELECT c FROM CompteUser c WHERE c.login=:login AND c.password=:password";
			TypedQuery<CompteUser> query = em.createQuery(jpql, CompteUser.class);
			query.setParameter("login", login);
			query.setParameter("password", password);
			compte = query.getSingleResult();
			System.out.println("Compte User trouvé avec succès !");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erreur : Compte User non trouvé !");
		}

		return compte;
	}

}
