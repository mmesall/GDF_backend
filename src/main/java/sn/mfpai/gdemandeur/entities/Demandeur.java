package sn.mfpai.gdemandeur.entities;

import java.util.List;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.minidev.json.annotate.JsonIgnore;


//@MappedSuperclass
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="status")
public abstract class Demandeur{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDemandeur;
	
	private String prenom;
	private String nom;
	private String adresse;
	private String tel;
	private String email;
	
	@OneToOne
	@JoinColumn(name = "dossier_id")
	private Dossier dossier;
	
	@OneToMany(mappedBy = "demandeur")
	@JsonIgnore
	private List<Diplome> diplomes;

	@OneToMany(mappedBy = "demandeur")
	@JsonIgnore
	private List<Experience> experiences;
	
	@OneToOne
	@JoinColumn(name= "user_id")
	private Utilisateur utilisateur;


	public Demandeur(String prenom, String nom, String adresse, String tel, String email, Dossier dossier,
			List<Diplome> diplomes, List<Experience> experiences, Utilisateur user) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.adresse = adresse;
		this.tel = tel;
		this.email = email;
		this.dossier = dossier;
		this.diplomes = diplomes;
		this.experiences = experiences;
		this.utilisateur = user;
	}
	
	public void afficherInfo() {
		System.out.println("Prenom : " + prenom);
        System.out.println("Nom : " + nom);
        System.out.println("Adresse : " + adresse);
        System.out.println("Tel : " + tel);
        System.out.println("Email : " + email);
    }
		

}
