package sn.mfpai.gdemandeur.service;

import java.util.List;

import sn.mfpai.gdemandeur.entities.Candidature;

public interface CandidatureService {
	
	Candidature createCandidature(Candidature c);
	
	Candidature updateCandidature(Candidature c);
	
	Candidature getCandidature(Long id);
	
	void deleteCandidature(Candidature c);
	
	void deleteCandidatureById(Long id);
	
	List<Candidature> getAllCandidatures();
	
	List<Candidature> findByEtablissementChoisi(String etab);
	
	List<Candidature> findByEtatCandidature(String etat);
	
	List<Candidature> findByOrderByEtatCandidatureAsc();
	
	List<Candidature> trierCandidaturesEtablissementsEtat();


}
