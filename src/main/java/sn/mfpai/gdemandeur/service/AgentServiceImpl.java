package sn.mfpai.gdemandeur.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import sn.mfpai.gdemandeur.entities.Agent;
import sn.mfpai.gdemandeur.entities.ServiceMFPAI;
import sn.mfpai.gdemandeur.entities.Utilisateur;
import sn.mfpai.gdemandeur.repos.AgentRepository;

public class AgentServiceImpl implements AgentService{
	
	@Autowired
	AgentRepository agentRepository;

	@Override
	public Agent createAgent(Agent a) {
		return agentRepository.save(a);
	}

	@Override
	public Agent updateAgent(Agent a) {
		return agentRepository.save(a);
	}

	@Override
	public void deleteAgent(Agent a) {
		agentRepository.delete(a);
	}

	@Override
	public void deleteAgentById(Long id) {
		agentRepository.deleteById(id);
	}

	@Override
	public Agent getAgent(Long id) {
		return agentRepository.findById(id).get();
	}

	@Override
	public List<Agent> getAllAgents() {
		return agentRepository.findAll();
	}

	@Override
	public List<Agent> findByMatricule(String matrice) {
		return agentRepository.findByMatricule(matrice);
	}

	@Override
	public List<Agent> findByOrderByMatriculeAsc() {
		return agentRepository.findByOrderByMatriculeAsc();
	}

	@Override
	public List<Agent> findByUtilisateurs(Utilisateur user) {
		return agentRepository.findByUtilisateurs(user);
	}

	@Override
	public List<Agent> findByServiceMfpai(ServiceMFPAI serv) {
		return agentRepository.findByServiceMfpai(serv);
	}

}
