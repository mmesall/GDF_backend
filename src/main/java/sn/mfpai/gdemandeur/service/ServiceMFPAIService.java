package sn.mfpai.gdemandeur.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import sn.mfpai.gdemandeur.entities.Agent;
import sn.mfpai.gdemandeur.entities.ServiceMFPAI;

public interface ServiceMFPAIService {
	
	ServiceMFPAI createServiceMFPAI(ServiceMFPAI serv);
	
	ServiceMFPAI updateServiceMFPAI(ServiceMFPAI serv);
	
	void deleteServiceMFPAI(ServiceMFPAI serv);
	
	void deleteServiceMFPAIById(Long id);
	
	ServiceMFPAI getServiceMFPAI(Long id);
	
	List<ServiceMFPAI> getAllServiceMFPAIs();
	
	List<ServiceMFPAI> findByNomService(String nom);

	List<ServiceMFPAI> findByOrderByNomServiceAsc();
	
	@Query("select s from ServiceMFPAI s where s.agents = ?1 ")
	List<ServiceMFPAI> findByAgents(Agent agent);
	

}
