package sn.mfpai.gdemandeur.service;

import java.util.List;

import sn.mfpai.gdemandeur.entities.Bailleur;

public interface BailleurService {
	
	Bailleur createBailleur(Bailleur b);
	
	Bailleur updateBailleur(Bailleur b);
	
	void deleteBailleur(Bailleur b);
	
	void deleteBailleurById(Long id);
	
	Bailleur getBailleur(Long id);
	
	List<Bailleur> getAllBailleurs();
	
	List<Bailleur> findByNomProjet(String nom);
	
	List<Bailleur> findByNomProjetContains(String nom);

	List<Bailleur> findByOrderByNomProjetAsc();
	
	List<Bailleur> trierBailleursNomsNbrePC();

}
