package sn.mfpai.gdemandeur.service;

import java.util.Date;
import java.util.List;

import sn.mfpai.gdemandeur.entities.Exam_Concours;

public interface ExamConcoursService {
	
	Exam_Concours saveExamConcours(Exam_Concours ec);
	
	Exam_Concours updateExamConcours(Exam_Concours ec);
	
	void deleteExamConcours(Exam_Concours ec);
	
	void deleteExamConcoursById(Long id);
	
	Exam_Concours getExamConcours(Long id);
	
	List<Exam_Concours> getAllExamConcours();
	
	List<Exam_Concours> findByNomExConcours(String nom);
	
	List<Exam_Concours> findByNomExConcoursContains(String nom);
	
	List<Exam_Concours> findByNomDate(String nom, Date date);

	List<Exam_Concours> findByOrderByNomExConcoursAsc();
	
	List<Exam_Concours> trierExamConcoursNomsDate();
	

}
