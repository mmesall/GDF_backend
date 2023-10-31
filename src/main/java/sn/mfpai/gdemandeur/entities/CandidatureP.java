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
@DiscriminatorValue("Professionnelle")
public class CandidatureP extends Candidature {
	
	@ManyToOne
	private FormationContinue formationContinue;

}
