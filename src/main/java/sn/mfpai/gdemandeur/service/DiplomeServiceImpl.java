package sn.mfpai.gdemandeur.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import sn.mfpai.gdemandeur.entities.Diplome;
import sn.mfpai.gdemandeur.repos.DiplomeRepository;

public class DiplomeServiceImpl implements DiplomeService{
	
	@Autowired
	DiplomeRepository diplomeRepository;

	@Override
	public Diplome createDiplome(Diplome d) {
		return diplomeRepository.save(d);
	}

	@Override
	public Diplome updateDiplome(Diplome d) {
		return diplomeRepository.save(d);
	}

	@Override
	public Diplome getDiplome(Long id) {
		return diplomeRepository.findById(id).get();
	}

	@Override
	public void deleteDiplome(Diplome d) {
		diplomeRepository.delete(d);
	}

	@Override
	public void deleteDiplomeById(Long id) {
		diplomeRepository.deleteById(id);
	}

	@Override
	public List<Diplome> getAllDiplomes() {
		return diplomeRepository.findAll();
	}

	@Override
	public List<Diplome> findByNomDiplome(String nom) {
		return diplomeRepository.findByNomDiplome(nom);
	}

	@Override
	public List<Diplome> findByNomDiplomeContains(String nom) {
		return diplomeRepository.findByNomDiplomeContains(nom);
	}

	@Override
	public List<Diplome> findByNomLieu(String nom, String lieu) {
		return diplomeRepository.findByNomLieu(nom, lieu);
	}

	@Override
	public List<Diplome> findByOrderByDateObtentionAsc() {
		return diplomeRepository.findByOrderByDateObtentionAsc();
	}

	@Override
	public List<Diplome> trierDiplomesNomsDate() {
		return diplomeRepository.trierDiplomesNomsDate();
	}

}
