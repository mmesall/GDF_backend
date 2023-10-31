package sn.mfpai.gdemandeur.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sn.mfpai.gdemandeur.entities.Bailleur;
import sn.mfpai.gdemandeur.entities.PriseEnCharge;

//@RepositoryRestResource(path = "rest")
public interface PriseEnChargeRepository extends JpaRepository<PriseEnCharge, Long>{
	
	List<PriseEnCharge> findByLibelle(String libelle);
	
	List<PriseEnCharge> findByLibelleContains(String libelle);
	
	@Query("select pc from PriseEnCharge pc where pc.libelle like %?1 and pc.montant > ?2")
	List<PriseEnCharge> findByLibelleMontant (String libelle, Double montant);

	@Query("select pc from PriseEnCharge pc where pc.libelle like %:libelle and pc.sousFiliere > :sousFiliere") 
	List<PriseEnCharge> findByLibelleSousFiliere (@Param("libelle") String libelle,@Param("sousFiliere") String sousFiliere);

	List<PriseEnCharge> findByOrderByMontantAsc();
	
	@Query("select pc from PriseEnCharge pc order by pc.libelle ASC, pc.montant ASC")
	List<PriseEnCharge> trierPriseEnChargesLibelleMontant();
	
	@Query("select pc from PriseEnCharge pc where pc.bailleur = ?1 ")
	List<PriseEnCharge> findByBailleur(Bailleur b);
	
	List<PriseEnCharge> findByBailleurIdBailleur(Long id);

}
