package sn.mfpai.gdemandeur.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import sn.mfpai.gdemandeur.entities.Exam_Concours;
import sn.mfpai.gdemandeur.entities.Formation;

@RepositoryRestResource(path = "rest")
public interface FormationRepository extends JpaRepository<Formation, Long> {
	
	List<Formation> findByNomFormation(String nom);
	
	List<Formation> findByNomFormationContains(String nom);
	
	/*@Query("select f from Formation f where f.nomFormation like %?1 and f.duree > ?2")
	List<Formation> findByNomDuree (String nom, String duree);*/

	@Query("select f from Formation f where f.nomFormation like %:nom and f.duree > :duree") 
	List<Formation> findByNomDuree (@Param("nom") String nom,@Param("duree") String duree);

	List<Formation> findByOrderByNomFormationAsc();
	
	@Query("select f from Formation f order by f.nomFormation ASC, f.duree ASC")
	List<Formation> trierFormationsNomsDuree();
	
	@Query("select f from Formation f where f.examConcours = ?1 ")
	List<Formation> findByExamConcours(Exam_Concours examConcours);
	
	List<Formation> findByExamConcoursIdExConc(Long id);
	
}
