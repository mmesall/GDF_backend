package sn.mfpai.gdemandeur.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dossier {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDossier;
	private String numDossier;
	private String typeDemandeur;
	private String departement;
	private String region;
	private byte cv;
	private byte lettreMotivation;
	private byte diplomeRequis;
	private String niveauEtude;
	private String profession;
	
	@OneToOne(mappedBy = "dossier")
	private Demandeur demandeur;

	
	public Dossier(String numDossier, String typeDemandeur, String departement, String region, byte cv,
			byte lettreMotivation, byte diplomeRequis, String niveauEtude, String profession, Demandeur demandeur) {
		super();
		this.numDossier = numDossier;
		this.typeDemandeur = typeDemandeur;
		this.departement = departement;
		this.region = region;
		this.cv = cv;
		this.lettreMotivation = lettreMotivation;
		this.diplomeRequis = diplomeRequis;
		this.niveauEtude = niveauEtude;
		this.profession = profession;
		this.demandeur = demandeur;
	}
	
	

}
