package sn.mfpai.gdemandeur.service;

import java.util.List;

import sn.mfpai.gdemandeur.dto.FormationDTO;
import sn.mfpai.gdemandeur.entities.Exam_Concours;
import sn.mfpai.gdemandeur.entities.Formation;
import sn.mfpai.gdemandeur.entities.PriseEnCharge;

public interface FormationService {

	Formation saveFormation(Formation f);
	Formation updateFormation(Formation f);
	
	List<Formation> getAllFormations();
	Formation getFormation(Long id);
	
	void deleteFormation(Formation f);
	void deleteFormationById(Long id);
	
	List<Formation> findByNomFormation(String nom);
	List<Formation> findByNomFormationContains(String nom); 
	List<Formation> findByNomDuree(String nom,String duree);
	List<Formation> findByExamConcours(Exam_Concours examConcours);
	List<Formation> findByExamConcoursIdExConc(Long id);
	/*List<Formation> findByPriseEnCharge(PriseEnCharge pc);
	List<Formation> findByPriseEnChargeIdPC(Long id);*/
	List<Formation> findByOrderByNomFormationAsc();
	List<Formation> trierFormationsNomsDuree();
	
	//FormationDTO convertEntityToDto(Formation f);
	//Formation convertDtoToEntity(FormationDTO formationDTO);
}
