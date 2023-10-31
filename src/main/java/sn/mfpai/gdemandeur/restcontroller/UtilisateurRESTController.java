package sn.mfpai.gdemandeur.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sn.mfpai.gdemandeur.entities.Utilisateur;
import sn.mfpai.gdemandeur.service.UtilisateurService;

@RestController
@RequestMapping("/utilisateurs")
@CrossOrigin
public class UtilisateurRESTController {
	
	@Autowired
	UtilisateurService utilisateurService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Utilisateur> getAllUtilisateurs() {
		return utilisateurService.getAllUtilisateurs();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Utilisateur getUtilisateurById(@PathVariable("id") Long id) {
		return utilisateurService.getUtilisateur(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Utilisateur createUtilisateur(@RequestBody Utilisateur user) 
	{
		return utilisateurService.createUtilisateur(user);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Utilisateur updateUtilisateur(@RequestBody Utilisateur user) 
	{
		return utilisateurService.updateUtilisateur(user);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteUtilisateur(@PathVariable("id") Long id)
	{
		utilisateurService.deleteUtilisateurById(id);
	}

}
