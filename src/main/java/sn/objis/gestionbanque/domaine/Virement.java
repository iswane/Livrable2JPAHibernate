package sn.objis.gestionbanque.domaine;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Virement")
public class Virement extends Operation{

	private static final long serialVersionUID = 1L;

	public Virement() {
		super();
	}

	public Virement(long numOperation, Date dateOperation, double montant) {
		super(numOperation, dateOperation, montant);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Virement";
	}
}
