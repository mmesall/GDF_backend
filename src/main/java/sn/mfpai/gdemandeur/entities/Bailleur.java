package sn.mfpai.gdemandeur.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Bailleur {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idBailleur;
	
	private String nomProjet;
	private Double budgetPrevu;
	private Double budgetDepense;
	private Double budgetRestant;
	private int nbrePC;
	
	@OneToMany(mappedBy = "bailleur")
	private List<PriseEnCharge> priseEnCharges;

	
	public Bailleur(String nomProjet, Double budgetPrevu, Double budgetDepense, Double budgetRestant, int nbrePC,
			List<PriseEnCharge> priseEnCharges) {
		super();
		this.nomProjet = nomProjet;
		this.budgetPrevu = budgetPrevu;
		this.budgetDepense = budgetDepense;
		this.budgetRestant = budgetRestant;
		this.nbrePC = nbrePC;
		this.priseEnCharges = priseEnCharges;
	}
	
	
}
