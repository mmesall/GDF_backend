package sn.mfpai.gdemandeur.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorValue("Initiale")
public class FormationInitiale extends Formation {
	
	private String filiere;
	
	@OneToMany(mappedBy = "formationInit")
	@JsonIgnore
	private List<CandidatureE> candidatureE;

}
