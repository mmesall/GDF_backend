package sn.mfpai.gdemandeur.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import sn.mfpai.gdemandeur.entities.Candidature;

public interface CandidatureRepository extends JpaRepository<Candidature, Long>{
	
	List<Candidature> findByEtablissementChoisi(String etab);
	
	List<Candidature> findByEtatCandidature(String etat);
	
	/*@Query("select d from Demandeur d where d.nom like %?1 and d.adresse > ?2")
	List<Demandeur> findByNomAdresse (String nom, String adresse);*/
	
	List<Candidature> findByOrderByEtatCandidatureAsc();
	
	@Query("select c from Candidature c order by c.etablissementChoisi ASC, c.etatCandidature ASC")
	List<Candidature> trierCandidaturesEtablissementsEtat();

}
