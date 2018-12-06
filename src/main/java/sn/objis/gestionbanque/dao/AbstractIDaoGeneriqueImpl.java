/**
 * 
 */
package sn.objis.gestionbanque.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

/**
 * @author OBJIS #10000codeurs
 *
 */
public abstract class AbstractIDaoGeneriqueImpl<T, K extends Serializable> implements IDao<T, K> {

	// Ouverture de l'unité de travail JPA
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestionbanque_pu");
	protected EntityManager em = emf.createEntityManager();

	protected EntityTransaction tx = null;

	// Création d'une classe Entity
	private Class<T> typeEntite;

	public AbstractIDaoGeneriqueImpl(Class<T> typeEntite) {
		super();
		this.typeEntite = typeEntite;
	}

	@Override
	public T add(T t) {
		try {
			tx = em.getTransaction();
			tx.begin();
			em.persist(t);
			tx.commit();
			System.out.println("Objet persisté avec succès !!!");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Objet non persisté !");
		}
		return t;

	}

	@Override
	public List<T> getAll() {
		List<T> listeElements = new ArrayList<>();
		try {
			// 2. Création d'un Criteria Builder
			CriteriaBuilder cb = em.getCriteriaBuilder();

			// 3. Création d'un Criteria Query
			CriteriaQuery<T> cq = cb.createQuery(typeEntite);

			// 4. Création de la requete au sein du CriteriaQuery
			cq.select(cq.from(typeEntite));
			// 5. Transmission du CiteriaQuery à l'entityManager qui construit la requete
			// sql et retourne un TypedQuery
			TypedQuery<T> query = em.createQuery(cq);
			// 6. Lancement du TypedQuery qui retourne le resulat de la requete
			listeElements = query.getResultList();
			System.out.println("Les éléments de l'entité :");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Liste non trouvé !");
		}
		return listeElements;
	}

	@Override
	public T findByKey(K k) {
		T entite = null;
		try {
			tx = em.getTransaction();
			tx.begin();
			entite = em.find(typeEntite, k);
			tx.commit();
			System.out.println("Element trouvé avec succès !");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Element non trouvé !");
		}
		return entite;
	}

}
