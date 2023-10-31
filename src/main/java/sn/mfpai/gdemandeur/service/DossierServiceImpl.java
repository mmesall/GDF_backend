package sn.mfpai.gdemandeur.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import sn.mfpai.gdemandeur.entities.Dossier;
import sn.mfpai.gdemandeur.repos.DossierRepository;

public class DossierServiceImpl implements DossierService{
	
	@Autowired
	DossierRepository dossierRepository;

	@Override
	public Dossier createDossier(Dossier doss) {
		return dossierRepository.save(doss);
	}

	@Override
	public Dossier updateDossier(Dossier doss) {
		return dossierRepository.save(doss);
	}

	@Override
	public void deleteDossier(Dossier doss) {
		dossierRepository.delete(doss);
	}

	@Override
	public void deleteDossierById(Long id) {
		dossierRepository.deleteById(id);
	}

	@Override
	public List<Dossier> getAllDossiers() {
		return dossierRepository.findAll();
	}

	@Override
	public List<Dossier> findByNumDossier(String numero) {
		return dossierRepository.findByNumDossier(numero);
	}

	@Override
	public List<Dossier> findByRegion(String region) {
		return dossierRepository.findByRegion(region);
	}

	@Override
	public List<Dossier> findByNiveauEtude(String niveauEtude) {
		return dossierRepository.findByNiveauEtude(niveauEtude);
	}

	@Override
	public List<Dossier> findByDiplomeRequis(String diplomeRequis) {
		return dossierRepository.findByDiplomeRequis(diplomeRequis);
	}

	@Override
	public List<Dossier> findByProfession(String profession) {
		return dossierRepository.findByProfession(profession);
	}

	@Override
	public List<Dossier> findByOrderByNumDossierAsc() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Dossier> trierDossiersRegionDepartement() {
		return dossierRepository.trierDossiersRegionDepartement();
	}

	@Override
	public Dossier getDossier(Long id) {
		return dossierRepository.findById(id).get();
	}

}
