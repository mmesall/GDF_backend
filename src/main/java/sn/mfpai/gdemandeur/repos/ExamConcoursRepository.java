package sn.mfpai.gdemandeur.repos;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sn.mfpai.gdemandeur.entities.Exam_Concours;

public interface ExamConcoursRepository extends JpaRepository<Exam_Concours, Long> {

	List<Exam_Concours> findByNomExConcours(String nom);
	
	List<Exam_Concours> findByNomExConcoursContains(String nom);
	
	@Query("select exc from Exam_Concours exc  where exc.nomExConcours like %:nom and exc.dateExConcours > :date") 
	List<Exam_Concours> findByNomDate (@Param("nom") String nom,@Param("date") Date date);

	List<Exam_Concours> findByOrderByNomExConcoursAsc();
	
	@Query("select exc from Exam_Concours exc order by exc.nomExConcours ASC, exc.dateExConcours ASC")
	List<Exam_Concours> trierExamConcoursNomsDate();
	
}
