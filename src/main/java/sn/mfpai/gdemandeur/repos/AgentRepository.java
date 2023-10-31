package sn.mfpai.gdemandeur.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import sn.mfpai.gdemandeur.entities.Agent;
import sn.mfpai.gdemandeur.entities.ServiceMFPAI;
import sn.mfpai.gdemandeur.entities.Utilisateur;

public interface AgentRepository extends JpaRepository<Agent, Long> {
	
	List<Agent> findByMatricule(String matrice);
	
	List<Agent> findByOrderByMatriculeAsc();
	
	@Query("select a from Agent a where a.utilisateur = ?1 ")
	List<Agent> findByUtilisateurs(Utilisateur user);
	
	//List<Formation> findByExamConcoursIdExConc(Long id);
	
	@Query("select a from Agent a where a.serviceMFPAI = ?1 ")
	List<Agent> findByServiceMfpai(ServiceMFPAI serv);

}
