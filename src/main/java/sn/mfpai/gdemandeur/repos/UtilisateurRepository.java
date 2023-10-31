package sn.mfpai.gdemandeur.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sn.mfpai.gdemandeur.entities.Agent;
import sn.mfpai.gdemandeur.entities.Demandeur;
import sn.mfpai.gdemandeur.entities.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long>{
	
	List<Utilisateur> findByProfil(String profil);

	@Query("select u from Utilisateur u where u.login like %:login and u.profil > :profil") 
	List<Utilisateur> findByLoginProfil (@Param("login") String login,@Param("profil") String profil);

	List<Utilisateur> findByOrderByLoginAsc();
	
	@Query("select u from Utilisateur u where u.agent = ?1 ")
	List<Utilisateur> findByAgent(Agent agent);
	
	//List<Formation> findByExamConcoursIdExConc(Long id);
	
	@Query("select u from Utilisateur u where u.demandeur = ?1 ")
	List<Utilisateur> findByDemandeur(Demandeur demandeur);

}
