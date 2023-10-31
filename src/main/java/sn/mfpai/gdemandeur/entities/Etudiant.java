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
@DiscriminatorValue("Etud")
public class Etudiant extends Demandeur{
	
	private String numEtudiant;

	public Etudiant(String prenom, String nom, String adresse,  String tel, String email, Dossier dossier, List<Diplome> diplomes, List<Experience> experiences,Utilisateur user) {
		super(prenom, nom, adresse,tel, email, dossier, diplomes, experiences, user);
		this.numEtudiant = numEtudiant;
	}
	
	public void afficherInfoEtudiant() {
        super.afficherInfo(); // Appel de la méthode de la classe de base
        System.out.println("Numero d'étudiant : " + numEtudiant);
    }

}
