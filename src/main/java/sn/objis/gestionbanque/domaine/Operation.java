package sn.objis.gestionbanque.domaine;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_OPERATION")
@Table(name="OPERATION")
public abstract class Operation implements Serializable {

	private static final long serialVersionUID = 1L;

	// Attributs
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_operation")
	private long idOperation;
	private long numOperation;
	@Temporal(TemporalType.DATE)
	private Date dateOperation;
	private double montant;
	@ManyToOne
	@JoinColumn(name="id_compte")
	private Compte compte;
	@ManyToOne
	@JoinColumn(name="id_employe")
	private Employe employe;

	// Constructeurs
	public Operation() {
		super();
	}

	public Operation(long numOperation, Date dateOperation, double montant) {
		super();
		this.numOperation = numOperation;
		this.dateOperation = dateOperation;
		this.montant = montant;
	}

	// Getters & Setters
	public long getIdOperation() {
		return idOperation;
	}

	public void setIdOperation(long idOperation) {
		this.idOperation = idOperation;
	}

	public long getNumOperation() {
		return numOperation;
	}

	public void setNumOperation(long numOperation) {
		this.numOperation = numOperation;
	}

	public Date getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

}
