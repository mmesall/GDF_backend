package sn.mfpai.gdemandeur.service;

import java.util.List;

import org.springframework.stereotype.Service;

import sn.mfpai.gdemandeur.entities.PriseEnCharge;

@Service
public interface PriseEnChargeService {
	
	PriseEnCharge savePriseEnCharge(PriseEnCharge pc);
	
	PriseEnCharge updatePriseEnCharge(PriseEnCharge pc);
	
	void deletePriseEnCharge(PriseEnCharge pc);
	
	void deletePriseEnChargeById(Long id);
	
	PriseEnCharge getPriseEnCharge(Long id);
	
	List<PriseEnCharge> getAllPriseEnCharges();
	
    List<PriseEnCharge> findByLibelle(String libelle);
	
	List<PriseEnCharge> findByLibelleContains(String libelle);
	
	List<PriseEnCharge> findByLibelleMontant(String libelle, Double montant);
 
	List<PriseEnCharge> findByLibelleSousFiliere(String libelle, String sousFiliere);

	List<PriseEnCharge> findByOrderByMontantAsc();
	
	List<PriseEnCharge> trierPriseEnChargesLibelleMontant();
	
	/*List<Formation> findByPriseEnCharge(PriseEnCharge pc);
	
	List<Formation> findByPriseEnChargeIdPC(Long id);e*/

}
