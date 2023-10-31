package sn.mfpai.gdemandeur.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PriseEnCharge {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPC;
	private String libelle;
	private Double montant;
	private int nbrePC;
	private String typeFormation;
	private String diplomePrepare;
	private String sousFiliere;
	
	/*@OneToOne
	@JoinColumn(name = "formation_id")
	private Formation formation;*/
	
	@OneToMany(mappedBy = "pc")
	@JsonIgnore
	private List<Formation> formations;
	
	@ManyToOne
	private Bailleur bailleur;
	
	/*public PriseEnCharge(String libelle, Double montant, int nbrePC, String typeFormation, String diplomePrepare,
			String sousFiliere) {
		super();
		this.libelle = libelle;
		this.montant = montant;
		this.nbrePC = nbrePC;
		this.typeFormation = typeFormation;
		this.diplomePrepare = diplomePrepare;
		this.sousFiliere = sousFiliere;
	}*/


	public PriseEnCharge(String libelle, Double montant, int nbrePC, String typeFormation, String diplomePrepare,
			String sousFiliere, List<Formation> formations) {
		super();
		this.libelle = libelle;
		this.montant = montant;
		this.nbrePC = nbrePC;
		this.typeFormation = typeFormation;
		this.diplomePrepare = diplomePrepare;
		this.sousFiliere = sousFiliere;
		this.formations = formations;
	}
	

	
}
