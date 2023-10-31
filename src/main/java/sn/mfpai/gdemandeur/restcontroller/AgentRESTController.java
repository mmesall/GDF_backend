package sn.mfpai.gdemandeur.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sn.mfpai.gdemandeur.entities.Agent;
import sn.mfpai.gdemandeur.service.AgentService;


@RestController
@RequestMapping("/agents")
@CrossOrigin
public class AgentRESTController {
	
	@Autowired
	AgentService agentService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Agent> getAllAgents() {
		return agentService.getAllAgents();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Agent getAgentById(@PathVariable("id") Long id) {
		return agentService.getAgent(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Agent createAgent(@RequestBody Agent agent) 
	{
		return agentService.createAgent(agent);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Agent updateAgent(@RequestBody Agent agent) 
	{
		return agentService.updateAgent(agent);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteAgent(@PathVariable("id") Long id)
	{
		agentService.deleteAgentById(id);
	}
}
