package sn.mfpai.gdemandeur.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import sn.mfpai.gdemandeur.entities.PriseEnCharge;
import sn.mfpai.gdemandeur.repos.PriseEnChargeRepository;


public class PriseEnChargeServiceImpl implements PriseEnChargeService{
	
	@Autowired
	PriseEnChargeRepository priseEnChargeRepository;

	@Override
	public PriseEnCharge savePriseEnCharge(PriseEnCharge pc) {
		return priseEnChargeRepository.save(pc);
	}

	@Override
	public PriseEnCharge updatePriseEnCharge(PriseEnCharge pc) {
		return priseEnChargeRepository.save(pc);
	}

	@Override
	public void deletePriseEnCharge(PriseEnCharge pc) {
		priseEnChargeRepository.delete(pc);
		
	}

	@Override
	public void deletePriseEnChargeById(Long id) {
		priseEnChargeRepository.deleteById(id);
	}

	@Override
	public PriseEnCharge getPriseEnCharge(Long id) {
		return priseEnChargeRepository.findById(id).get();
	}

	@Override
	public List<PriseEnCharge> findByLibelle(String libelle) {
		return priseEnChargeRepository.findByLibelle(libelle);
	}

	@Override
	public List<PriseEnCharge> findByLibelleContains(String libelle) {
		return priseEnChargeRepository.findByLibelleContains(libelle);
	}

	@Override
	public List<PriseEnCharge> findByLibelleMontant(String libelle, Double montant) {
		return priseEnChargeRepository.findByLibelleMontant(libelle, montant);
	}

	@Override
	public List<PriseEnCharge> findByLibelleSousFiliere(String libelle, String sousFiliere) {
		return priseEnChargeRepository.findByLibelleSousFiliere(libelle, sousFiliere);
	}

	@Override
	public List<PriseEnCharge> findByOrderByMontantAsc() {
		return priseEnChargeRepository.findByOrderByMontantAsc();
	}

	@Override
	public List<PriseEnCharge> trierPriseEnChargesLibelleMontant() {
		return priseEnChargeRepository.trierPriseEnChargesLibelleMontant();
	}

	@Override
	public List<PriseEnCharge> getAllPriseEnCharges() {
		return priseEnChargeRepository.findAll();
	}

	/*@Override
	public List<Formation> findByPriseEnCharge(PriseEnCharge pc) {
		return priseEnChargeRepository.find;
	}

	@Override
	public List<Formation> findByPriseEnChargeIdPC(Long id) {
		// TODO Auto-generated method stub
		return null;
	}*/

}
