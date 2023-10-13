package sn.mfpai.gdemandeur.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.mfpai.gdemandeur.entities.Exam_Concours;
import sn.mfpai.gdemandeur.repos.ExamConcoursRepository;

@Service
public class ExamConcoursServiceImpl implements ExamConcoursService {
	
	@Autowired
	ExamConcoursRepository examConcoursRepository;

	@Override
	public Exam_Concours saveExamConcours(Exam_Concours ec) {
		return examConcoursRepository.save(ec);
	}

	@Override
	public Exam_Concours updateExamConcours(Exam_Concours ec) {
		return examConcoursRepository.save(ec);
	}

	@Override
	public void deleteExamConcours(Exam_Concours ec) {
		examConcoursRepository.delete(ec);	
	}

	@Override
	public void deleteExamConcoursById(Long id) {
		examConcoursRepository.deleteById(id);
	}

	@Override
	public Exam_Concours getExamConcours(Long id) {
		return examConcoursRepository.findById(id).get();
	}

	@Override
	public List<Exam_Concours> getAllExamConcours() {
		return examConcoursRepository.findAll();
	}

	@Override
	public List<Exam_Concours> findByNomExConcours(String nom) {
		return examConcoursRepository.findByNomExConcours(nom);
	}

	@Override
	public List<Exam_Concours> findByNomDate(String nom, Date date) {
		return examConcoursRepository.findByNomDate(nom, date);
	}

	@Override
	public List<Exam_Concours> findByOrderByNomExConcoursAsc() {
		return examConcoursRepository.findByOrderByNomExConcoursAsc();
	}

	@Override
	public List<Exam_Concours> trierExamConcoursNomsDate() {
		return examConcoursRepository.trierExamConcoursNomsDate();
	}

}
