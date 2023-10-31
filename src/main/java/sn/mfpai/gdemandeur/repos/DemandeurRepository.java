package sn.mfpai.gdemandeur.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import sn.mfpai.gdemandeur.entities.Demandeur;

public interface DemandeurRepository extends JpaRepository<Demandeur, Long> {
	
	List<Demandeur> findByNom(String nom);
	
	List<Demandeur> findByNomContains(String nom);
	
	@Query("select d from Demandeur d where d.nom like %?1 and d.adresse > ?2")
	List<Demandeur> findByNomAdresse (String nom, String adresse);
	
	List<Demandeur> findByOrderByNomAsc();
	
	@Query("select d from Demandeur d order by d.nom ASC, d.prenom ASC")
	List<Demandeur> trierDemandeursNomsPrenom();

}
