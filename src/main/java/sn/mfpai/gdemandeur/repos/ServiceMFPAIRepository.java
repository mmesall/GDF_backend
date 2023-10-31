package sn.mfpai.gdemandeur.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import sn.mfpai.gdemandeur.entities.Agent;
import sn.mfpai.gdemandeur.entities.ServiceMFPAI;

public interface ServiceMFPAIRepository extends JpaRepository<ServiceMFPAI, Long> {
	
	List<ServiceMFPAI> findByNomService(String nom);

	List<ServiceMFPAI> findByOrderByNomServiceAsc();
	
	@Query("select s from ServiceMFPAI s where s.agents = ?1 ")
	List<ServiceMFPAI> findByAgents(Agent agent);
	
	

}
