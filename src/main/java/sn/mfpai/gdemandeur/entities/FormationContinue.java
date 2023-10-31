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
@DiscriminatorValue("Continue")
public class FormationContinue extends Formation{
	
	private String secteur;
	private String diplomePrepare;
	private String debouche;
	
	@OneToMany(mappedBy = "formationContinue")
	@JsonIgnore
	private List<CandidatureP> candidatureP;

}
