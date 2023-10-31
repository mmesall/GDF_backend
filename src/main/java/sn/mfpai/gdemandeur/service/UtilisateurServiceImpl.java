package sn.mfpai.gdemandeur.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import sn.mfpai.gdemandeur.entities.Agent;
import sn.mfpai.gdemandeur.entities.Demandeur;
import sn.mfpai.gdemandeur.entities.Utilisateur;
import sn.mfpai.gdemandeur.repos.UtilisateurRepository;

public class UtilisateurServiceImpl implements UtilisateurService{
	
	@Autowired
	UtilisateurRepository utilisateurRepository;

	@Override
	public Utilisateur createUtilisateur(Utilisateur user) {
		return utilisateurRepository.save(user);
	}

	@Override
	public Utilisateur updateUtilisateur(Utilisateur user) {
		return utilisateurRepository.save(user);
	}

	@Override
	public void deleteUtilisateur(Utilisateur user) {
		utilisateurRepository.delete(user);
	}

	@Override
	public void deleteUtilisateurById(Long id) {
		utilisateurRepository.deleteById(id);
	}

	@Override
	public Utilisateur getUtilisateur(Long id) {
		return utilisateurRepository.findById(id).get();
	}

	@Override
	public List<Utilisateur> getAllUtilisateurs() {
		return utilisateurRepository.findAll();
	}

	@Override
	public List<Utilisateur> findByProfil(String profil) {
		return utilisateurRepository.findByProfil(profil);
	}

	@Override
	public List<Utilisateur> findByLoginProfil(String login, String profil) {
		return utilisateurRepository.findByLoginProfil(login, profil);
	}

	@Override
	public List<Utilisateur> findByOrderByLoginAsc() {
		return utilisateurRepository.findByOrderByLoginAsc();
	}

	@Override
	public List<Utilisateur> findByAgent(Agent agent) {
		return utilisateurRepository.findByAgent(agent);
	}

	@Override
	public List<Utilisateur> findByDemandeur(Demandeur demandeur) {
		return utilisateurRepository.findByDemandeur(demandeur);
	}

}
