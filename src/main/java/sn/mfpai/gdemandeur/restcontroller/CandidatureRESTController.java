package sn.mfpai.gdemandeur.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sn.mfpai.gdemandeur.entities.Candidature;
import sn.mfpai.gdemandeur.service.CandidatureService;

@RestController
@RequestMapping("/candidatures")
@CrossOrigin
public class CandidatureRESTController {
	
	@Autowired
	CandidatureService candidatureService;

	@RequestMapping(method = RequestMethod.GET)
	public List<Candidature> getAllCandidatures(){
		return candidatureService.getAllCandidatures();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Candidature getCandidatureById(@PathVariable("id") Long id) {
		return candidatureService.getCandidature(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Candidature createCandidature(@RequestBody Candidature c) 
	{
		return candidatureService.createCandidature(c);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Candidature updateCandidature(@RequestBody Candidature c) 
	{
		return candidatureService.updateCandidature(c);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteCandidature(@PathVariable("id") Long id)
	{
		candidatureService.deleteCandidatureById(id);
	}
}
