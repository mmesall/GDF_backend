package sn.mfpai.gdemandeur.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import sn.mfpai.gdemandeur.entities.Candidature;
import sn.mfpai.gdemandeur.repos.CandidatureRepository;

public class CandidatureServiceImpl implements CandidatureService{
	
	@Autowired
	CandidatureRepository candidatureRepository;

	@Override
	public Candidature createCandidature(Candidature c) {
		return candidatureRepository.save(c);
	}

	@Override
	public Candidature updateCandidature(Candidature c) {
		return candidatureRepository.save(c);
	}

	@Override
	public Candidature getCandidature(Long id) {
		return candidatureRepository.findById(id).get();
	}

	@Override
	public void deleteCandidature(Candidature c) {
		candidatureRepository.delete(c);
	}

	@Override
	public void deleteCandidatureById(Long id) {
		candidatureRepository.deleteById(id);
	}

	@Override
	public List<Candidature> getAllCandidatures() {
		return candidatureRepository.findAll();
	}

	@Override
	public List<Candidature> findByEtablissementChoisi(String etab) {
		return candidatureRepository.findByEtablissementChoisi(etab);
	}

	@Override
	public List<Candidature> findByEtatCandidature(String etat) {
		return candidatureRepository.findByEtatCandidature(etat);
	}

	@Override
	public List<Candidature> findByOrderByEtatCandidatureAsc() {
		return candidatureRepository.findByOrderByEtatCandidatureAsc();
	}

	@Override
	public List<Candidature> trierCandidaturesEtablissementsEtat() {
		return candidatureRepository.trierCandidaturesEtablissementsEtat();
	}

}
