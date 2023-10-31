package sn.mfpai.gdemandeur.service;

import java.util.List;

import sn.mfpai.gdemandeur.entities.Experience;

public interface ExperienceService {
	
	Experience createExperience(Experience exp);
	
	Experience updateExperience(Experience exp);
	
	Experience getExperience(Long id);
	
	void deleteExperience(Experience exp);
	
	void deleteExperienceById(Long id);
	
	List<Experience> getAllExperiences();
	
	List<Experience> findByNomExperience(String nom);
	
	List<Experience> findByNomExperienceContains(String nom);
 
	List<Experience> findByNomExperiencePosteOccupe (String nom,String poste);

	List<Experience> findByOrderByNomExperienceAsc();
	
	List<Experience> trierExperiencesNomsEntreprise();

}
