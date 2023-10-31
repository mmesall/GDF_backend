package sn.mfpai.gdemandeur.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorValue("Classique")
public class CandidatureE extends Candidature {
	
	@ManyToOne
	private FormationInitiale formationInit;
	
	

}
