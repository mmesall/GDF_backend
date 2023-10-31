package sn.mfpai.gdemandeur.service;

import java.util.List;

import sn.mfpai.gdemandeur.entities.Diplome;

public interface DiplomeService {
	
	Diplome createDiplome(Diplome d);
	
	Diplome updateDiplome(Diplome d);
	
	Diplome getDiplome(Long id);
	
	void deleteDiplome(Diplome d);
	
	void deleteDiplomeById(Long id);
	
	List<Diplome> getAllDiplomes();
	
	List<Diplome> findByNomDiplome(String nom);
	
	List<Diplome> findByNomDiplomeContains(String nom);

	List<Diplome> findByNomLieu (String nom,String lieu);

	List<Diplome> findByOrderByDateObtentionAsc();
	
	List<Diplome> trierDiplomesNomsDate();

}
