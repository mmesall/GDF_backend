package sn.mfpai.gdemandeur.entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
//@Data
@NoArgsConstructor
@AllArgsConstructor
public class Agent {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAgent;
	
	private String matricule;
	
	@OneToOne
	@JoinColumn(name= "user_id")
	private Utilisateur utilisateur;
	
	@ManyToOne
	private ServiceMFPAI serviceMFPAI;
	

	public Long getIdAgent() {
		return idAgent;
	}

	public void setIdAgent(Long idAgent) {
		this.idAgent = idAgent;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public ServiceMFPAI getServiceMFPAI() {
		return serviceMFPAI;
	}

	public void setServiceMFPAI(ServiceMFPAI serviceMFPAI) {
		this.serviceMFPAI = serviceMFPAI;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idAgent, matricule, serviceMFPAI, utilisateur);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agent other = (Agent) obj;
		return Objects.equals(idAgent, other.idAgent) && Objects.equals(matricule, other.matricule)
				&& Objects.equals(serviceMFPAI, other.serviceMFPAI) && Objects.equals(utilisateur, other.utilisateur);
	}

	public Agent(String matricule, Utilisateur utilisateur, ServiceMFPAI serviceMFPAI) {
		super();
		this.matricule = matricule;
		this.utilisateur = utilisateur;
		this.serviceMFPAI = serviceMFPAI;
	}

	@Override
	public String toString() {
		return "Agent [idAgent=" + idAgent + ", matricule=" + matricule + ", utilisateur=" + utilisateur
				+ ", serviceMFPAI=" + serviceMFPAI + "]";
	}
	
	
	

}
