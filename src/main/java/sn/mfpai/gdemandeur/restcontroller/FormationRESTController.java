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
import sn.mfpai.gdemandeur.service.FormationService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class FormationRESTController {

	@Autowired
	FormationService formationService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<FormationDTO> getAllFormations() {
		return formationService.getAllFormations();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public FormationDTO getFormationById(@PathVariable("id") Long id) {
		return formationService.getFormation(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public FormationDTO createFormation(@RequestBody FormationDTO formationDTO) 
	{
		return formationService.saveFormation(formationDTO);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public FormationDTO updateFormation(@RequestBody FormationDTO formationDTO) 
	{
		return formationService.updateFormation(formationDTO);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteFormation(@PathVariable("id") Long id)
	{
		formationService.deleteFormationById(id);
	}
		
	
	
}
