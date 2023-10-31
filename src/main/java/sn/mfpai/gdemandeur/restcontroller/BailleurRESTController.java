package sn.mfpai.gdemandeur.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sn.mfpai.gdemandeur.entities.Bailleur;
import sn.mfpai.gdemandeur.service.BailleurService;

@RestController
@RequestMapping("/bailleurs")
@CrossOrigin
public class BailleurRESTController {
	
	@Autowired
	BailleurService bailleurService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Bailleur> getAllBailleurs(){
		return bailleurService.getAllBailleurs();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Bailleur getBailleurById(@PathVariable("id") Long id) {
		return bailleurService.getBailleur(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Bailleur createBailleur(@RequestBody Bailleur b) 
	{
		return bailleurService.createBailleur(b);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public Bailleur updateBailleur(@RequestBody Bailleur b) 
	{
		return bailleurService.updateBailleur(b);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteBailleur(@PathVariable("id") Long id)
	{
		bailleurService.deleteBailleurById(id);
	}
}
