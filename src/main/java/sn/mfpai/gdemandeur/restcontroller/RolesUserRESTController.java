package sn.mfpai.gdemandeur.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sn.mfpai.gdemandeur.entities.RolesUser;
import sn.mfpai.gdemandeur.service.RolesUserService;


@RestController
@RequestMapping("/rolesUsers")
@CrossOrigin
public class RolesUserRESTController {
	
	@Autowired
	RolesUserService rolesUserService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<RolesUser> getAllRolesUsers() {
		return rolesUserService.getAllRolesUsers();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public RolesUser getRolesUserById(@PathVariable("id") Long id) {
		return rolesUserService.getRolesUser(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public RolesUser createRolesUser(@RequestBody RolesUser role) 
	{
		return rolesUserService.createRolesUser(role);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public RolesUser updateRolesUser(@RequestBody RolesUser role) 
	{
		return rolesUserService.updateRolesUser(role);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteRolesUser(@PathVariable("id") Long id)
	{
		rolesUserService.deleteRolesUserById(id);
	}


}
