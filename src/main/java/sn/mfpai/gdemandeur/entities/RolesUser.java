package sn.mfpai.gdemandeur.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RolesUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRole;
	
	private String nomRole;
	
	@ManyToMany(mappedBy = "roles")
	private Set<Utilisateur> users = new HashSet<>();
	

}
