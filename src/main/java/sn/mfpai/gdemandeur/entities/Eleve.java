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
@DiscriminatorValue("Elev")
public class Eleve extends Demandeur{
	
	private String niveauEtude;
	
	public Eleve(String prenom, String nom, String adresse,String tel, String email, String niveauEtude, Dossier dossier, List<Diplome> diplomes, List<Experience> experiences, Utilisateur user) {
		super(prenom, nom, adresse, tel, email, dossier, diplomes, experiences, user);
		this.niveauEtude = niveauEtude;
	}
	
	public void afficherInfoEleve() {
        super.afficherInfo(); // Appel de la méthode de la classe de base
        System.out.println("Niveau d'étude : " + niveauEtude);
    }
	
	
	
}
