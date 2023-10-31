package sn.mfpai.gdemandeur.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import sn.mfpai.gdemandeur.entities.RolesUser;
import sn.mfpai.gdemandeur.entities.Utilisateur;

public interface RolesUserService {
	
	RolesUser createRolesUser(RolesUser role);
	
	RolesUser updateRolesUser(RolesUser role);
	
	void deletRolesUser(RolesUser role);
	
	void deleteRolesUserById(Long id);
	
	RolesUser getRolesUser(Long id);
	
	List<RolesUser> getAllRolesUsers();
	
	List<RolesUser> findByNomRole(String nom);
	
	List<RolesUser> findByNomRoleContains(String nom);
	
	@Query("select r from RolesUser r where r.users = ?1 ")
	List<RolesUser> findByUtilisateur(Utilisateur user);

}
