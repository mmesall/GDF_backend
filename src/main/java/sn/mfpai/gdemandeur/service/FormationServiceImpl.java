package sn.mfpai.gdemandeur.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import sn.mfpai.gdemandeur.dto.FormationDTO;
import sn.mfpai.gdemandeur.entities.Exam_Concours;
import sn.mfpai.gdemandeur.entities.Formation;
import sn.mfpai.gdemandeur.entities.PriseEnCharge;
import sn.mfpai.gdemandeur.repos.FormationRepository;


public class FormationServiceImpl implements FormationService {

	@Autowired
	FormationRepository formationRepository;
	
	/*@Override
	public FormationDTO saveFormation(FormationDTO f) {
		return convertEntityToDto(formationRepository.save(convertDtoToEntity(f)));
	}

	@Override
	public FormationDTO updateFormation(FormationDTO f) {
		return convertEntityToDto(formationRepository.save(convertDtoToEntity(f)));
	}*/
	
	@Override
	public Formation saveFormation(Formation f) {
		return formationRepository.save(f);
	}
	
	@Override
	public Formation updateFormation(Formation f) {
		return formationRepository.save(f);
	}

	@Override
	public void deleteFormation(Formation f) {
		formationRepository.delete(f);
	}

	@Override
	public void deleteFormationById(Long id) {
		formationRepository.deleteById(id);
	}

	@Override
	public Formation getFormation(Long id) {
		return formationRepository.findById(id).get();
	}
	
	public List<Formation> getAllFormations(){
		return formationRepository.findAll();
	}
	
	/*@Override
	public FormationDTO getFormation(Long id) {
		return convertEntityToDto(formationRepository.findById(id).get());
	}

	@Override
	public List<FormationDTO> getAllFormations() {
		return formationRepository.findAll().stream()
				.map(this::convertEntityToDto)
				.collect(Collectors.toList());
	}*/

	@Override
	public List<Formation> findByNomFormation(String nom) {
		return formationRepository.findByNomFormation(nom);
	}

	@Override
	public List<Formation> findByNomFormationContains(String nom) {
		return formationRepository.findByNomFormationContains(nom);
	}

	@Override
	public List<Formation> findByNomDuree(String nom, String duree) {
		return formationRepository.findByNomDuree(nom, duree);
	}

	@Override
	public List<Formation> findByOrderByNomFormationAsc() {
		return formationRepository.findByOrderByNomFormationAsc();
	}

	@Override
	public List<Formation> trierFormationsNomsDuree() {
		return formationRepository.trierFormationsNomsDuree();
	}

	/*@Override
	public FormationDTO convertEntityToDto(Formation f) {
	
		return FormationDTO.builder()
				.idForm(f.getIdForm())
				.nomFormation(f.getNomFormation())
				.typeFormation(f.getTypeFormation())
				.duree(f.getDuree())
				.admission(f.getAdmission())
				.diplomeRequis(f.getDiplomeRequis())
				.build();
	}*/

	/*@Override
	public Formation convertDtoToEntity(FormationDTO formationDTO) {
		Formation formation = new Formation();
		
		formation.setIdForm(formationDTO.getIdForm());
		formation.setNomFormation(formationDTO.getNomFormation());
		formation.setTypeFormation(formationDTO.getTypeFormation());
		formation.setDuree(formationDTO.getDuree());
		formation.setAdmission(formationDTO.getAdmission());
		formation.setDiplomeRequis(formationDTO.getDiplomeRequis());
		
			return formation;
	}*/

	@Override
	public List<Formation> findByExamConcours(Exam_Concours examConcours) {
		return formationRepository.findByExamConcours(examConcours);
		 
	}

	@Override
	public List<Formation> findByExamConcoursIdExConc(Long id) {
		return formationRepository.findByExamConcoursIdExConc(id);
	}

	/*@Override
	public List<Formation> findByPriseEnCharge(PriseEnCharge pc) {
		return formationRepository.findByPriseEnCharge(pc);
	}

	@Override
	public List<Formation> findByPriseEnChargeIdPC(Long id) {
		return formationRepository.findByPriseEnChargeIdPC(id);
	}*/

}
