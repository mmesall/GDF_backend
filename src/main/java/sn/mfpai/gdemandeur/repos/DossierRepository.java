package sn.mfpai.gdemandeur.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import sn.mfpai.gdemandeur.entities.Dossier;

public interface DossierRepository extends JpaRepository<Dossier, Long> {
	
	List<Dossier> findByNumDossier(String numero);
	
	List<Dossier> findByRegion(String region);
	
	List<Dossier> findByNiveauEtude(String niveauEtude);
	
	List<Dossier> findByDiplomeRequis(String diplomeRequis);
	
	List<Dossier> findByProfession(String profession);
	
	List<Dossier> findByOrderByNumDossierAsc();
	
	@Query("select doss from Dossier doss order by doss.region ASC, doss.departement ASC")
	List<Dossier> trierDossiersRegionDepartement();

}
