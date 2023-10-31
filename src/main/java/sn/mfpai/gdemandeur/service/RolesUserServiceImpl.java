package sn.mfpai.gdemandeur.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import sn.mfpai.gdemandeur.entities.RolesUser;
import sn.mfpai.gdemandeur.entities.Utilisateur;
import sn.mfpai.gdemandeur.repos.RolesUserRepository;

public class RolesUserServiceImpl implements RolesUserService {
	
	@Autowired
	RolesUserRepository rolesUserRepository;

	@Override
	public RolesUser createRolesUser(RolesUser role) {
		return rolesUserRepository.save(role);
	}

	@Override
	public RolesUser updateRolesUser(RolesUser role) {
		return rolesUserRepository.save(role);
	}

	@Override
	public void deletRolesUser(RolesUser role) {
		rolesUserRepository.delete(role);
	}

	@Override
	public void deleteRolesUserById(Long id) {
		rolesUserRepository.deleteById(id);
	}

	@Override
	public RolesUser getRolesUser(Long id) {
		return rolesUserRepository.findById(id).get();
	}

	@Override
	public List<RolesUser> getAllRolesUsers() {
		return rolesUserRepository.findAll();
	}

	@Override
	public List<RolesUser> findByNomRole(String nom) {
		return rolesUserRepository.findByNomRole(nom);
	}

	@Override
	public List<RolesUser> findByNomRoleContains(String nom) {
		return rolesUserRepository.findByNomRoleContains(nom);
	}

	@Override
	public List<RolesUser> findByUtilisateur(Utilisateur user) {
		return rolesUserRepository.findByUtilisateur(user);
	}

}
