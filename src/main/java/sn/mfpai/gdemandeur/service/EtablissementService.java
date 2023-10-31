package sn.mfpai.gdemandeur.service;

import java.util.List;

import sn.mfpai.gdemandeur.entities.Etablissement;

public interface EtablissementService {
	
	Etablissement saveEtablissement(Etablissement etab);
	
	Etablissement updateEtablissement(Etablissement etab);
	
	void deleteEtablissement(Etablissement etab);
	
	void deleteEtablissementById(Long id);
	
	Etablissement getEtablissement(Long id);
	
	List<Etablissement> getAllEtablissements();
	
	List<Etablissement> findByNomEtab(String nom);
	
	List<Etablissement> findByNomEtabContains(String nom);

	List<Etablissement> findByOrderByNomEtabAsc();
	
	List<Etablissement> findByNomEtabDepartement (String nomEtab, String departement);
	
	List<Etablissement> findByNomEtabRegion (String nomEtab, String region);
	
	List<Etablissement> trierEtablissementNomType();

}
