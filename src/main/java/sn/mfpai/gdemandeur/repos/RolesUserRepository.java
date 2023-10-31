package sn.mfpai.gdemandeur.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import sn.mfpai.gdemandeur.entities.RolesUser;
import sn.mfpai.gdemandeur.entities.Utilisateur;

public interface RolesUserRepository extends JpaRepository<RolesUser, Long> {
	
	List<RolesUser> findByNomRole(String nom);
	
	List<RolesUser> findByNomRoleContains(String nom);
	
	@Query("select r from RolesUser r where r.users = ?1 ")
	List<RolesUser> findByUtilisateur(Utilisateur user);

}
