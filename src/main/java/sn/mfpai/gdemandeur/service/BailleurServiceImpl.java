package sn.mfpai.gdemandeur.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import sn.mfpai.gdemandeur.entities.Bailleur;
import sn.mfpai.gdemandeur.repos.BailleurRepository;

public class BailleurServiceImpl implements BailleurService {
	
	@Autowired
	BailleurRepository bailleurRepository;

	@Override
	public Bailleur createBailleur(Bailleur b) {
		return bailleurRepository.save(b);
	}

	@Override
	public Bailleur updateBailleur(Bailleur b) {
		return bailleurRepository.save(b);
	}

	@Override
	public void deleteBailleur(Bailleur b) {
		bailleurRepository.delete(b);
		
	}

	@Override
	public void deleteBailleurById(Long id) {
		bailleurRepository.deleteById(id);
	}

	@Override
	public Bailleur getBailleur(Long id) {
		return bailleurRepository.findById(id).get();
	}

	@Override
	public List<Bailleur> getAllBailleurs() {
		return bailleurRepository.findAll();
	}

	@Override
	public List<Bailleur> findByNomProjet(String nom) {
		return bailleurRepository.findByNomProjet(nom);
	}

	@Override
	public List<Bailleur> findByNomProjetContains(String nom) {
		return bailleurRepository.findByNomProjetContains(nom);
	}

	@Override
	public List<Bailleur> findByOrderByNomProjetAsc() {
		return bailleurRepository.findByOrderByNomProjetAsc();
	}

	@Override
	public List<Bailleur> trierBailleursNomsNbrePC() {
		return bailleurRepository.trierBailleursNomsNbrePC();
	}

}
