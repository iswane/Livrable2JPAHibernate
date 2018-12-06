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
@DiscriminatorValue("Versement")
public class Versement extends Operation{

	private static final long serialVersionUID = 1L;

	// Constructeurs
	public Versement() {
		super();
	}

	public Versement(long numOperation, Date dateOperation, double montant) {
		super(numOperation, dateOperation, montant);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Versement";
	}
}
