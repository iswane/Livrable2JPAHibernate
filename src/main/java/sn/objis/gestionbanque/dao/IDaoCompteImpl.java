/**
 * 
 */
package sn.objis.gestionbanque.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import sn.objis.gestionbanque.domaine.Client;
import sn.objis.gestionbanque.domaine.Compte;
import sn.objis.gestionbanque.domaine.Employe;

/**
 * @author OBJIS #10000codeurs
 *
 */
public class IDaoCompteImpl extends AbstractIDaoGeneriqueImpl<Compte, Integer> implements IDaoCompte {

	public IDaoCompteImpl() {
		super(Compte.class);
	}

	@Override
	public List<Compte> findCompteByClient(Client client) {
		return null;
	}

	@Override
	public List<Compte> findCompteByEmploye(Employe emp) {
		return null;
	}

	@Override
	public Compte findCompteByNumCompte(String numCompte) {
		Compte cpte = null;
		try {

			// Traitement
			String jpql = "SELECT c FROM Compte c WHERE c.numCompte=:numCompte";
			TypedQuery<Compte> query = em.createQuery(jpql, Compte.class);
			query.setParameter("numCompte", numCompte);
			cpte = query.getSingleResult();
			System.out.println("Compte trouvé avec succès !");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erreur : Compte non trouvé !");
		}

		return cpte;
	}

}
