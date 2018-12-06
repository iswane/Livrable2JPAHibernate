/**
 * 
 */
package sn.objis.gestionbanque.domaine;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
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
@Table(name="roles")
public class Roles implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// Attributs
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_roles")
	private long id_roles;
	private String role_name;
	private String description;
	@ManyToMany(mappedBy="roles")
	private List<CompteUser> compteUsers;

	// Constructeurs
	public Roles() {
		super();
	}

	public Roles(long id_roles, String role_name, String description) {
		super();
		this.id_roles = id_roles;
		this.role_name = role_name;
		this.setDescription(description);
	}

	// Getters & Setters
	public long getId_roles() {
		return id_roles;
	}

	public void setId_roles(long id_roles) {
		this.id_roles = id_roles;
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	public List<CompteUser> getCompteUsers() {
		return compteUsers;
	}

	public void setCompteUsers(List<CompteUser> compteUsers) {
		this.compteUsers = compteUsers;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
