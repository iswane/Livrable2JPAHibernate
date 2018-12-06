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
@DiscriminatorValue("Courant")
public class CompteCourant extends Compte {

	private static final long serialVersionUID = 1L;
	// Attributs
	private double decouvert;

	// Constructeurs
	public CompteCourant() {
		super();
	}
	public CompteCourant(String numCompte, Date dateCreation, double solde, double decouvert) {
		super(numCompte, dateCreation, solde);
		this.decouvert = decouvert;
	}

	// Getters & Setters
	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Courant";
	}

}
