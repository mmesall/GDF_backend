package sn.mfpai.gdemandeur.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sn.mfpai.gdemandeur.entities.ServiceMFPAI;
import sn.mfpai.gdemandeur.service.ServiceMFPAIService;

@RestController
@RequestMapping("/services")
@CrossOrigin
public class ServiceMFPAIRESTController {
	
	@Autowired
	ServiceMFPAIService serviceMFPAIService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<ServiceMFPAI> getAllServiceMFPAIs() {
		return serviceMFPAIService.getAllServiceMFPAIs();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ServiceMFPAI getServiceMFPAIById(@PathVariable("id") Long id) {
		return serviceMFPAIService.getServiceMFPAI(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ServiceMFPAI createServiceMFPAI(@RequestBody ServiceMFPAI serv) 
	{
		return serviceMFPAIService.createServiceMFPAI(serv);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public ServiceMFPAI updateServiceMFPAI(@RequestBody ServiceMFPAI serv) 
	{
		return serviceMFPAIService.updateServiceMFPAI(serv);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteServiceMFPAI(@PathVariable("id") Long id)
	{
		serviceMFPAIService.deleteServiceMFPAIById(id);
	}

}
