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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author OBJIS #10000codeurs
 *
 */
@Entity
@Table(name="utilisateur")
public class CompteUser implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// Attributs
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_utilisateur")
	private long id;
	private String login;
	private String password;
	@ManyToMany
	@JoinTable(name="utilisateur_roles",
			joinColumns = @JoinColumn(name = "id_user"),
			inverseJoinColumns = @JoinColumn(name = "id_roles"))
	private List<Roles> roles;
	
	// Constructeurs
	public CompteUser() {
		super();
	}
	public CompteUser(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}
	
	// Getters & Setters
	
	public String getLogin() {
		return login;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Roles> getRoles() {
		return roles;
	}
	public void setRoles(List<Roles> roles) {
		this.roles = roles;
	}
	
	
}
