package sn.mfpai.gdemandeur.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sn.mfpai.gdemandeur.dto.FormationDTO;
import sn.mfpai.gdemandeur.entities.Dossier;
import sn.mfpai.gdemandeur.service.DossierService;

@RestController
@RequestMapping("/dossiers")
@CrossOrigin
public class DossierRESTController {
	
	@Autowired
	DossierService dossierService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Dossier> getAllDossiers() {
		return dossierService.getAllDossiers();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Dossier getDossierById(@PathVariable("id") Long id) {
		return dossierService.getDossier(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Dossier createDossier(@RequestBody Dossier doss) 
	{
		return dossierService.createDossier(doss);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Dossier updateDossier(@RequestBody Dossier doss) 
	{
		return dossierService.updateDossier(doss);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteDossier(@PathVariable("id") Long id)
	{
		dossierService.deleteDossierById(id);
	}
	
}
