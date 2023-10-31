package sn.mfpai.gdemandeur.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Experience {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idExp;
	
	private String nomExperience;
	private String posteOccupe;
	private Date dateDebutExp;
	private Date dateFinExp;
	private String nomEntreprise;
	
	@ManyToOne
	private Demandeur demandeur;

	public Experience(String nomExperience, String posteOccupe, Date dateDebutExp, Date dateFinExp,
			String nomEntreprise, Demandeur demandeur) {
		super();
		this.nomExperience = nomExperience;
		this.posteOccupe = posteOccupe;
		this.dateDebutExp = dateDebutExp;
		this.dateFinExp = dateFinExp;
		this.nomEntreprise = nomEntreprise;
		this.demandeur = demandeur;
	}
	
	
}
