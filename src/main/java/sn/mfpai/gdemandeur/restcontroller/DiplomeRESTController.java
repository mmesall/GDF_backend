package sn.mfpai.gdemandeur.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sn.mfpai.gdemandeur.entities.Diplome;
import sn.mfpai.gdemandeur.service.DiplomeService;

@RestController
@RequestMapping("/diplomes")
@CrossOrigin
public class DiplomeRESTController {
	
	@Autowired
	DiplomeService diplomeService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Diplome> getAllDiplomes() {
		return diplomeService.getAllDiplomes();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Diplome getDiplomeById(@PathVariable("id") Long id) {
		return diplomeService.getDiplome(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	public Diplome createDiplome(@RequestBody Diplome d) 
	{
		return diplomeService.createDiplome(d);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Diplome updateDiplome(@RequestBody Diplome d) 
	{
		return diplomeService.updateDiplome(d);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteDiplome(@PathVariable("id") Long id)
	{
		diplomeService.deleteDiplomeById(id);
	}
}
