/**
 * 
 */
package sn.objis.gestionbanque.dao;

import javax.persistence.TypedQuery;

import sn.objis.gestionbanque.domaine.Employe;
import sn.objis.gestionbanque.domaine.Groupe;

/**
 * @author OBJIS #10000codeurs
 *
 */
public class IDaoEmployeImpl extends AbstractIDaoGeneriqueImpl<Employe, Integer> implements IDaoEmploye {

	public IDaoEmployeImpl() {
		super(Employe.class);
	}

	@Override
	public Employe findEmpByGroupe(Groupe groupe) {
		return null;
	}

	@Override
	public Employe findEmpById(long id) {
		Employe emp = null;
		try {
			tx = em.getTransaction();
			tx.begin();
			emp = em.find(Employe.class, id);
			tx.commit();
			System.out.println("Employé trouvé avec succès !");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Employé non trouvé !");
		}
		return emp;
	}

	@Override
	public Employe findEmployeByIdUser(long idUser) {
		Employe emp = null;
		try {

			// Traitement
			String jpql = "SELECT c FROM Employe c join fetch c.cuser cu WHERE cu.id=:idUser";
			TypedQuery<Employe> query = em.createQuery(jpql, Employe.class);
			query.setParameter("idUser", idUser);
			emp = query.getSingleResult();
			System.out.println("Employé trouvé avec succès !");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erreur : Employé non trouvé !");
		}

		return emp;
	}

	@Override
	public void addEmpToGroupe(long idGrpe, long idEmp) {
		Employe emp = null;
		Groupe grp = null;
		try {
			tx = em.getTransaction();
			tx.begin();
			emp = em.find(Employe.class, idEmp);
			grp = em.find(Groupe.class, idGrpe);
			emp.getGroupes().add(grp);
			grp.getEmployes().add(emp);
			tx.commit();
			System.out.println("Employé trouvé avec succès !");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Employé non trouvé !");
		}
	}

}
