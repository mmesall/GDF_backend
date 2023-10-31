package sn.mfpai.gdemandeur.entities;

import java.util.List;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorValue("Prof")
public class Professionnel extends Demandeur{

	private String profession;
	
	public Professionnel(String prenom, String nom, String adresse, String tel, String email, Dossier dossier, List<Diplome> diplomes, List<Experience> experiences, Utilisateur user) {
		super(prenom, nom, adresse, tel, email, dossier, diplomes, experiences, user);
		this.profession = profession;
	}
	
	public void afficherInfoProfessionnel() {
        super.afficherInfo(); // Appel de la méthode de la classe de base
        System.out.println("Profession : " + profession);
    }

}
