package sn.mfpai.gdemandeur.entities;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//@Data
@NoArgsConstructor
@AllArgsConstructor
public class Utilisateur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUser;
	
	private String login;
	private String password;
	private Boolean active; 
	private String profil;
	
	@OneToOne(mappedBy = "utilisateur")
	private Demandeur demandeur;
	
	@OneToOne(mappedBy = "utilisateur")
	private Agent agent;
	
	@ManyToMany
	@JoinTable(
			name = "user_roles",
			joinColumns = @JoinColumn(name="user_id"),
			inverseJoinColumns = @JoinColumn(name="rolesUser_id")
			)
			private Set<RolesUser> roles = new HashSet<>();

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getLogin() {
		return login;
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

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getProfil() {
		return profil;
	}

	public void setProfil(String profil) {
		this.profil = profil;
	}

	public Demandeur getDemandeur() {
		return demandeur;
	}

	public void setDemandeur(Demandeur demandeur) {
		this.demandeur = demandeur;
	}

	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	public Set<RolesUser> getRoles() {
		return roles;
	}

	public void setRoles(Set<RolesUser> roles) {
		this.roles = roles;
	}

	public Utilisateur(String login, String password, Boolean active, String profil, Demandeur demandeur, Agent agent,
			Set<RolesUser> roles) {
		super();
		this.login = login;
		this.password = password;
		this.active = active;
		this.profil = profil;
		this.demandeur = demandeur;
		this.agent = agent;
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "Utilisateur [idUser=" + idUser + ", login=" + login + ", password=" + password + ", active=" + active
				+ ", profil=" + profil + ", demandeur=" + demandeur + ", agent=" + agent + ", roles=" + roles + "]";
	}
	
	
}
