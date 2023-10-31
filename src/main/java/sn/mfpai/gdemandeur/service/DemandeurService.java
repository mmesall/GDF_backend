package sn.mfpai.gdemandeur.service;

import java.util.List;

import sn.mfpai.gdemandeur.entities.Demandeur;

public interface DemandeurService {
	
	Demandeur createDemandeur(Demandeur d);
	
	Demandeur updateDemandeur(Demandeur d);
	
	void deleteDemandeur(Demandeur d);
	
	void deleteDemandeurById(Long id);
	
	Demandeur getDemandeur(Long id);
	
	List<Demandeur> getAllDemandeurs();
	
	List<Demandeur> findByNom(String nom);
	
	List<Demandeur> findByNomContains(String nom);
	
	List<Demandeur> findByNomAdresse (String nom, String adresse);
	
	List<Demandeur> findByOrderByNomAsc();
	
	List<Demandeur> trierDemandeursNomsPrenom();

}
