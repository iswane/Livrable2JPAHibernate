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
@DiscriminatorValue("Retrait")
public class Retrait extends Operation {

	private static final long serialVersionUID = 1L;

	// Constructeurs
	public Retrait() {
		super();
	}

	public Retrait(long numOperation, Date dateOperation, double montant) {
		super(numOperation, dateOperation, montant);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Retrait";
	}
}
