package sn.mfpai.gdemandeur.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sn.mfpai.gdemandeur.entities.Experience;

public interface ExperienceRepository extends JpaRepository<Experience, Long>{
	
	List<Experience> findByNomExperience(String nom);
	
	List<Experience> findByNomExperienceContains(String nom);

	@Query("select e from Experience e where e.nomExperience like %:nom and e.posteOccupe > :poste") 
	List<Experience> findByNomExperiencePosteOccupe (@Param("nom") String nom,@Param("poste") String poste);

	List<Experience> findByOrderByNomExperienceAsc();
	
	@Query("select e from Experience e order by e.nomExperience ASC, e.nomEntreprise ASC")
	List<Experience> trierExperiencesNomsEntreprise();

}
