package sn.mfpai.gdemandeur.entities;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Exam_Concours {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idExConc;
	
	private String nomExConcours;
	private String nature;
	private Date dateExConcours;
	private String niveauRequis;
	private Date dateOuverture;
	private Date dateCloture;
	
	@OneToMany(mappedBy = "examConcours")
	@JsonIgnore
	private List<Formation> formations;

	
	public Exam_Concours(String nomExConcours, String nature, Date dateExConcours, String niveauRequis,
			Date dateOuverture, Date dateCloture, List<Formation> formations) {
		super();
		this.nomExConcours = nomExConcours;
		this.nature = nature;
		this.dateExConcours = dateExConcours;
		this.niveauRequis = niveauRequis;
		this.dateOuverture = dateOuverture;
		this.dateCloture = dateCloture;
		this.formations = formations;
	}
	

}
