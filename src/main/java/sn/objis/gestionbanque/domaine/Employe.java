/**
 * 
 */
package sn.objis.gestionbanque.domaine;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author OBJIS #10000codeurs
 *
 */
@Entity
@Table(name="EMPLOYE")
public class Employe implements Serializable{

	private static final long serialVersionUID = 1L;

	// Attributs
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_employe")
	private long idEmploye;
	private String nom;
	private String prenom;
	private String matriculeEmp;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_Emp_Sup", unique = false, nullable = true, insertable = true, updatable = true)
	private Employe supHierarchique;
	@ManyToMany
	@JoinTable(name="Employe_Groupes", 
	joinColumns=@JoinColumn(name="ID_EMP"), 
	inverseJoinColumns=@JoinColumn(name="ID_GROUPE"))
	private List<Groupe> groupes;
	@OneToOne
	@JoinColumn
	private CompteUser cuser;

	// Constructeurs
	public Employe() {
		super();
	}

	public Employe(String nom, String prenom, String matriculeEmp) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.matriculeEmp = matriculeEmp;
	}

	// Getters & Setters
	public long getIdEmploye() {
		return idEmploye;
	}

	public void setIdEmploye(long idEmploye) {
		this.idEmploye = idEmploye;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMatriculeEmp() {
		return matriculeEmp;
	}

	public void setMatriculeEmp(String matriculeEmp) {
		this.matriculeEmp = matriculeEmp;
	}

	public List<Groupe> getGroupes() {
		return groupes;
	}

	public void setGroupes(List<Groupe> groupes) {
		this.groupes = groupes;
	}

	public Employe getSupHierarchique() {
		return supHierarchique;
	}

	public void setSupHierarchique(Employe supHierarchique) {
		this.supHierarchique = supHierarchique;
	}
	public CompteUser getCuser() {
		return cuser;
	}
	public void setCuser(CompteUser cuser) {
		this.cuser = cuser;
	}
	
}
