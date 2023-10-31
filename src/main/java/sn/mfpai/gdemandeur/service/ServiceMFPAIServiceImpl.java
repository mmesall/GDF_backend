package sn.mfpai.gdemandeur.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import sn.mfpai.gdemandeur.entities.Agent;
import sn.mfpai.gdemandeur.entities.ServiceMFPAI;
import sn.mfpai.gdemandeur.repos.ServiceMFPAIRepository;

public class ServiceMFPAIServiceImpl implements ServiceMFPAIService{

	@Autowired
	ServiceMFPAIRepository serviceMFPAIRepository;
	
	@Override
	public ServiceMFPAI createServiceMFPAI(ServiceMFPAI serv) {
		return serviceMFPAIRepository.save(serv);
	}

	@Override
	public ServiceMFPAI updateServiceMFPAI(ServiceMFPAI serv) {
		return serviceMFPAIRepository.save(serv);
	}

	@Override
	public void deleteServiceMFPAI(ServiceMFPAI serv) {
		serviceMFPAIRepository.delete(serv);
	}

	@Override
	public void deleteServiceMFPAIById(Long id) {
		serviceMFPAIRepository.deleteById(id);
		
	}

	@Override
	public ServiceMFPAI getServiceMFPAI(Long id) {
		return serviceMFPAIRepository.findById(id).get();
	}

	@Override
	public List<ServiceMFPAI> getAllServiceMFPAIs() {
		return serviceMFPAIRepository.findAll();
	}

	@Override
	public List<ServiceMFPAI> findByNomService(String nom) {
		return serviceMFPAIRepository.findByNomService(nom);
	}

	@Override
	public List<ServiceMFPAI> findByOrderByNomServiceAsc() {
		return serviceMFPAIRepository.findByOrderByNomServiceAsc();
	}

	@Override
	public List<ServiceMFPAI> findByAgents(Agent agent) {
		return serviceMFPAIRepository.findByAgents(agent);
	}

}
