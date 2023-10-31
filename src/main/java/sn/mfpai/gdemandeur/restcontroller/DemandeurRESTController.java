package sn.mfpai.gdemandeur.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sn.mfpai.gdemandeur.entities.Demandeur;
import sn.mfpai.gdemandeur.service.DemandeurService;

@RestController
@RequestMapping("/demandeurs")
@CrossOrigin
public class DemandeurRESTController {
	
	@Autowired
	DemandeurService demandeurService;

	@RequestMapping(method = RequestMethod.GET)
	public List<Demandeur> getAllDemandeurs(){
		return demandeurService.getAllDemandeurs();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Demandeur getDemandeurById(@PathVariable("id") Long id) {
		return demandeurService.getDemandeur(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Demandeur createDemandeur(@RequestBody Demandeur d) 
	{
		return demandeurService.createDemandeur(d);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Demandeur updateDemandeur(@RequestBody Demandeur d) 
	{
		return demandeurService.updateDemandeur(d);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteDemandeur(@PathVariable("id") Long id)
	{
		demandeurService.deleteDemandeurById(id);
	}
}
