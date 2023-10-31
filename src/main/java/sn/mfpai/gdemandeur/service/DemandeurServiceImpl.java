package sn.mfpai.gdemandeur.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import sn.mfpai.gdemandeur.entities.Demandeur;
import sn.mfpai.gdemandeur.repos.DemandeurRepository;

public class DemandeurServiceImpl implements DemandeurService{
	
	@Autowired
	DemandeurRepository demandeurRepository;

	@Override
	public Demandeur createDemandeur(Demandeur d) {
		return demandeurRepository.save(d);
	}

	@Override
	public Demandeur updateDemandeur(Demandeur d) {
		return demandeurRepository.save(d);
	}

	@Override
	public void deleteDemandeur(Demandeur d) {
		demandeurRepository.delete(d);
		
	}

	@Override
	public void deleteDemandeurById(Long id) {
		demandeurRepository.deleteById(id);
		
	}

	@Override
	public Demandeur getDemandeur(Long id) {
		return demandeurRepository.findById(id).get();
	}

	@Override
	public List<Demandeur> getAllDemandeurs() {
		return demandeurRepository.findAll();
	}

	@Override
	public List<Demandeur> findByNom(String nom) {
		return demandeurRepository.findByNom(nom);
	}

	@Override
	public List<Demandeur> findByNomContains(String nom) {
		return demandeurRepository.findByNomContains(nom);
	}

	@Override
	public List<Demandeur> findByNomAdresse(String nom, String adresse) {
		return demandeurRepository.findByNomAdresse(nom, adresse);
	}

	@Override
	public List<Demandeur> findByOrderByNomAsc() {
		return demandeurRepository.findByOrderByNomAsc();
	}

	@Override
	public List<Demandeur> trierDemandeursNomsPrenom() {
		return demandeurRepository.trierDemandeursNomsPrenom();
	}

}
