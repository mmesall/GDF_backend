package sn.mfpai.gdemandeur.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import sn.mfpai.gdemandeur.entities.Dossier;

public interface DossierService {

	Dossier createDossier(Dossier doss);
	
	Dossier updateDossier(Dossier doss);
	
	void deleteDossier(Dossier doss);
	
	void deleteDossierById(Long id);
	
	Dossier getDossier(Long id);
	
	List<Dossier> getAllDossiers();
	
	List<Dossier> findByNumDossier(String numero);
	
	List<Dossier> findByRegion(String region);
	
	List<Dossier> findByNiveauEtude(String niveauEtude);
	
	List<Dossier> findByDiplomeRequis(String diplomeRequis);
	
	List<Dossier> findByProfession(String profession);
	
	List<Dossier> findByOrderByNumDossierAsc();
	
	@Query("select doss from Dossier doss order by doss.region ASC, doss.departement ASC")
	List<Dossier> trierDossiersRegionDepartement();
	
	
}
