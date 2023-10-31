package sn.mfpai.gdemandeur.service;

import java.util.List;

import sn.mfpai.gdemandeur.entities.Agent;
import sn.mfpai.gdemandeur.entities.ServiceMFPAI;
import sn.mfpai.gdemandeur.entities.Utilisateur;

public interface AgentService {
	
	Agent createAgent(Agent a);
	
	Agent updateAgent(Agent a);
	
	void deleteAgent(Agent a);
	
	void deleteAgentById(Long id);
	
	Agent getAgent(Long id);
	
	List<Agent> getAllAgents();
	
	List<Agent> findByMatricule(String matrice);
	
	List<Agent> findByOrderByMatriculeAsc();
	
	List<Agent> findByUtilisateurs(Utilisateur user);
	
	List<Agent> findByServiceMfpai(ServiceMFPAI serv);


}
