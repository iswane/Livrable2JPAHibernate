/**
 * 
 */
package sn.objis.gestionbanque.domaine;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author OBJIS #10000codeurs
 *
 */
@Entity
@Table(name="GROUPE")
public class Groupe implements Serializable{

	private static final long serialVersionUID = 1L;

	// Attributs
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long numGroupe;
	private String nomGroupe;
	@ManyToMany(mappedBy="groupes")
	private List<Employe> employes;
	
	// Constructeurs
	public Groupe() {
		super();
	}

	public Groupe(String nomGroupe) {
		super();
		this.nomGroupe = nomGroupe;
	}

	// Getters & Setters
	public long getNumGroupe() {
		return numGroupe;
	}

	public void setNumGroupe(long numGroupe) {
		this.numGroupe = numGroupe;
	}

	public String getNomGroupe() {
		return nomGroupe;
	}

	public void setNomGroupe(String nomGroupe) {
		this.nomGroupe = nomGroupe;
	}

	public List<Employe> getEmployes() {
		return employes;
	}

	public void setEmployes(List<Employe> employes) {
		this.employes = employes;
	}
	
	
}
