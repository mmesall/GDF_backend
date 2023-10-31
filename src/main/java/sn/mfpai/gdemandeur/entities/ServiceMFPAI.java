package sn.mfpai.gdemandeur.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.minidev.json.annotate.JsonIgnore;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServiceMFPAI {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idServ;
	
	private String nomService;
	private String ChefService;
	private String role;
	
	@OneToMany(mappedBy = "serviceMFPAI")
	@JsonIgnore
	private List<Agent> agents;

}
