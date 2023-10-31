package sn.mfpai.gdemandeur.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import sn.mfpai.gdemandeur.entities.Experience;
import sn.mfpai.gdemandeur.repos.ExperienceRepository;

public class ExperienceServiceImpl implements ExperienceService{
	
	@Autowired
	ExperienceRepository experienceRepository;

	@Override
	public Experience createExperience(Experience exp) {
		return experienceRepository.save(exp);
	}

	@Override
	public Experience updateExperience(Experience exp) {
		return experienceRepository.save(exp);
	}

	@Override
	public Experience getExperience(Long id) {
		return experienceRepository.findById(id).get();
	}

	@Override
	public void deleteExperience(Experience exp) {
		experienceRepository.delete(exp);
	}

	@Override
	public void deleteExperienceById(Long id) {
		experienceRepository.deleteById(id);
	}

	@Override
	public List<Experience> getAllExperiences() {
		return experienceRepository.findAll();
	}

	@Override
	public List<Experience> findByNomExperience(String nom) {
		return experienceRepository.findByNomExperience(nom);
	}

	@Override
	public List<Experience> findByNomExperienceContains(String nom) {
		return experienceRepository.findByNomExperienceContains(nom);
	}

	@Override
	public List<Experience> findByNomExperiencePosteOccupe(String nom, String poste) {
		return experienceRepository.findByNomExperiencePosteOccupe(nom, poste);
	}

	@Override
	public List<Experience> findByOrderByNomExperienceAsc() {
		return experienceRepository.findByOrderByNomExperienceAsc();
	}

	@Override
	public List<Experience> trierExperiencesNomsEntreprise() {
		return experienceRepository.trierExperiencesNomsEntreprise();
	}

}
