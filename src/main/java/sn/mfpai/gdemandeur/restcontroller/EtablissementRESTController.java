package sn.mfpai.gdemandeur.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sn.mfpai.gdemandeur.entities.Etablissement;
import sn.mfpai.gdemandeur.service.EtablissementService;


@RestController
@RequestMapping("/etablissements")
@CrossOrigin
public class EtablissementRESTController {
	
	@Autowired
	EtablissementService etablissementService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Etablissement> getAllEtablissements() {
		return etablissementService.getAllEtablissements();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Etablissement getEtablissementById(@PathVariable("id") Long id) {
		return etablissementService.getEtablissement(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Etablissement createEtablissement(@RequestBody Etablissement etab) 
	{
		return etablissementService.saveEtablissement(etab);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Etablissement updateEtablissement(@RequestBody Etablissement etab) 
	{
		return etablissementService.updateEtablissement(etab);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteEtablissement(@PathVariable("id") Long id)
	{
		etablissementService.deleteEtablissementById(id);
	}

}
