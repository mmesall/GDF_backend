package sn.mfpai.gdemandeur.entities;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="typeCandidature")
public abstract class Candidature {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCand;
	
	private String etablissementChoisi;
	private String etatCandidature;

}
