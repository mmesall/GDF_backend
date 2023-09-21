package sn.mfpai.gdemandeur.service;

import java.util.List;

import sn.mfpai.gdemandeur.dto.FormationDTO;
import sn.mfpai.gdemandeur.entities.Formation;

public interface FormationService {

	FormationDTO saveFormation(FormationDTO f);
	FormationDTO updateFormation(FormationDTO f);
	
	List<FormationDTO> getAllFormations();
	FormationDTO getFormation(Long id);
	
	void deleteFormation(Formation f);
	void deleteFormationById(Long id);
	
	
	
	List<Formation> findByNomFormation(String nom);
	List<Formation> findByNomFormationContains(String nom); 
	List<Formation> findByNomDuree(String nom,String duree);
	/*List<Formation> findByConcours (Concours concours);
	List<Formation> findByConcoursIdConc(Long id);*/
	List<Formation> findByOrderByNomFormationAsc();
	List<Formation> trierFormationsNomsDuree();
	
	FormationDTO convertEntityToDto(Formation f);
	Formation convertDtoToEntity(FormationDTO formationDTO);
}
