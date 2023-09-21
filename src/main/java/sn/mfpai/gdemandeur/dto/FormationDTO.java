package sn.mfpai.gdemandeur.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FormationDTO {
	
	private Long idForm;
	private String nomFormation;
	private String typeFormation;
	private String duree;
	private String admission;
	private String diplomeRequis;
}
