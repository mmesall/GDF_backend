package sn.mfpai.gdemandeur.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import sn.mfpai.gdemandeur.entities.Etablissement;
import sn.mfpai.gdemandeur.repos.EtablissementRepository;

public class EtablissementServiceImpl implements EtablissementService{
	
	@Autowired
	EtablissementRepository etablissementRepository;

	@Override
	public Etablissement saveEtablissement(Etablissement etab) {
		return etablissementRepository.save(etab);
	}

	@Override
	public Etablissement updateEtablissement(Etablissement etab) {
		return etablissementRepository.save(etab);
	}

	@Override
	public void deleteEtablissement(Etablissement etab) {
		etablissementRepository.delete(etab);
	}

	@Override
	public void deleteEtablissementById(Long id) {
		etablissementRepository.deleteById(id);
	}

	@Override
	public Etablissement getEtablissement(Long id) {
		return etablissementRepository.findById(id).get();
	}

	@Override
	public List<Etablissement> getAllEtablissements() {
		return etablissementRepository.findAll();
	}

	@Override
	public List<Etablissement> findByNomEtab(String nom) {
		return etablissementRepository.findByNomEtab(nom);
	}

	@Override
	public List<Etablissement> findByNomEtabContains(String nom) {
		return etablissementRepository.findByNomEtabContains(nom);
	}

	@Override
	public List<Etablissement> findByOrderByNomEtabAsc() {
		return etablissementRepository.findByOrderByNomEtabAsc();
	}

	@Override
	public List<Etablissement> findByNomEtabDepartement(String nomEtab, String departement) {
		return etablissementRepository.findByNomEtabDepartement(nomEtab, departement);
	}

	@Override
	public List<Etablissement> findByNomEtabRegion(String nomEtab, String region) {
		return etablissementRepository.findByNomEtabRegion(nomEtab, region);
	}

	@Override
	public List<Etablissement> trierEtablissementNomType() {
		return etablissementRepository.trierEtablissementNomType();
	}

}
