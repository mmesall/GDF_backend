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
public class Diplome {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDiplome;
	
	private String nomDiplome;
	private String lieuObtention;
	private Date dateObtention;
	
	@ManyToOne
	private Demandeur demandeur;

	public Diplome(String nomDiplome, String lieuObtention, Date dateObtention, Demandeur demandeur) {
		super();
		this.nomDiplome = nomDiplome;
		this.lieuObtention = lieuObtention;
		this.dateObtention = dateObtention;
		this.demandeur = demandeur;
	}
	
	
	

}
