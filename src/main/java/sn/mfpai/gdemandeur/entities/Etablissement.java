package sn.mfpai.gdemandeur.entities;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.JoinColumn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Etablissement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEtab;
	
	private String nomEtab;
	private String adresseEtab;
	private Number tel1;
	private Number tel2;
	private String courriel;
	private String typeEtab;
	private String departement;
	private String region;
	
	@ManyToMany
	@JoinTable(
			name = "T_formation_etablissement",
			joinColumns =@JoinColumn(name="etab_id"),
			inverseJoinColumns =@JoinColumn(name = "form_id")
			)
	private List<Formation> forms = new ArrayList<>();

	
	public Etablissement(String nomEtab, String adresseEtab, Number tel1, Number tel2, String courriel, String typeEtab,
			String departement, String region, List<Formation> forms) {
		super();
		this.nomEtab = nomEtab;
		this.adresseEtab = adresseEtab;
		this.tel1 = tel1;
		this.tel2 = tel2;
		this.courriel = courriel;
		this.typeEtab = typeEtab;
		this.departement = departement;
		this.region = region;
		this.forms = forms;
	}
	
}
