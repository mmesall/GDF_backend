package sn.mfpai.gdemandeur.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Formation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idForm;
	private String nomFormation;
	private String typeFormation;
	private String duree;
	private String admission;
	private String diplomeRequis;
	
	@ManyToOne
	private Exam_Concours examConcours;

	public Formation(String nomFormation, String typeFormation, String duree, String admission, String diplomeRequis,
			Exam_Concours examConcours) {
		super();
		this.nomFormation = nomFormation;
		this.typeFormation = typeFormation;
		this.duree = duree;
		this.admission = admission;
		this.diplomeRequis = diplomeRequis;
		this.examConcours = examConcours;
	}
	
	
	
	

}
