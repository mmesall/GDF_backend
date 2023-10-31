package sn.mfpai.gdemandeur.service;

import java.util.List;

import sn.mfpai.gdemandeur.entities.Agent;
import sn.mfpai.gdemandeur.entities.Demandeur;
import sn.mfpai.gdemandeur.entities.Utilisateur;

public interface UtilisateurService {
	
	Utilisateur createUtilisateur(Utilisateur user);
	
	Utilisateur updateUtilisateur(Utilisateur user);
	
	void deleteUtilisateur(Utilisateur user);
	
	void deleteUtilisateurById(Long id);
	
	Utilisateur getUtilisateur(Long id);
	
	List<Utilisateur> getAllUtilisateurs();
	
	List<Utilisateur> findByProfil(String profil);

	List<Utilisateur> findByLoginProfil ( String login,String profil);

	List<Utilisateur> findByOrderByLoginAsc();
	
	List<Utilisateur> findByAgent(Agent agent);
	
	List<Utilisateur> findByDemandeur(Demandeur demandeur);

}
