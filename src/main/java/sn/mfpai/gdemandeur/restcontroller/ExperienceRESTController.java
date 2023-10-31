package sn.mfpai.gdemandeur.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sn.mfpai.gdemandeur.entities.Experience;
import sn.mfpai.gdemandeur.service.ExperienceService;

@RestController
@RequestMapping("/experiences")
@CrossOrigin
public class ExperienceRESTController {
	
	@Autowired
	ExperienceService experienceService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Experience> getAllExperiences() {
		return experienceService.getAllExperiences();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Experience getExperienceById(@PathVariable("id") Long id) {
		return experienceService.getExperience(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Experience createExperience(@RequestBody Experience exp) 
	{
		return experienceService.createExperience(exp);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Experience updateExperience(@RequestBody Experience exp) 
	{
		return experienceService.updateExperience(exp);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteExperience(@PathVariable("id") Long id)
	{
		experienceService.deleteExperienceById(id);
	}
}
