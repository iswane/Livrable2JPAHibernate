/**
 * 
 */
package sn.objis.gestionbanque.domaine;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author OBJIS #10000codeurs
 *
 */
@Entity
@DiscriminatorValue("Epargne")
public class CompteEpargne extends Compte {

	private static final long serialVersionUID = 1L;

	// Attributs
	private double taux;

	// Constructeurs
	public CompteEpargne() {
		super();
	}
	public CompteEpargne(String numCompte, Date dateCreation, double solde, double taux) {
		super(numCompte, dateCreation, solde);
		this.taux = taux;
	}


	// Getters & Setters
	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Epargne";
	}

}
