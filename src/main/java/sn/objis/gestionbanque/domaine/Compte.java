package sn.objis.gestionbanque.domaine;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Compte
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_COMPTE")
@Table(name="COMPTES")
public abstract class Compte implements Serializable {

	private static final long serialVersionUID = 1L;
	
	// Propriétés
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_compte")
	private long id;
	@Column(unique=true)
	private String numCompte;
	@Temporal(TemporalType.DATE)
	private Date dateCreation;
	private double solde;
	@ManyToOne
	@JoinColumn(name="id_client")
	private Client client;
	@ManyToOne
	@JoinColumn(name="id_employe")
	private Employe employe;
	@OneToMany(mappedBy="compte")
	private List<Operation> operations;

	// Constructeurs
	public Compte() {
		super();
	}

	public Compte(String numCompte, Date dateCreation, double solde) {
		super();
		this.numCompte = numCompte;
		this.dateCreation = dateCreation;
		this.solde = solde;
	}

	// Getters & Setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(String numCompte) {
		this.numCompte = numCompte;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Operation> getOperations() {
		return operations;
	}

	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

}
