package sn.mfpai.gdemandeur.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import sn.mfpai.gdemandeur.entities.Etablissement;

public interface EtablissementRepository extends JpaRepository<Etablissement, Long> {
	
	List<Etablissement> findByNomEtab(String nom);
	
	List<Etablissement> findByNomEtabContains(String nom);

	List<Etablissement> findByOrderByNomEtabAsc();
	
	@Query("select e from Etablissement e where e.nomEtab like %?1 and e.departement > ?2")
	List<Etablissement> findByNomEtabDepartement (String nomEtab, String departement);
	
	@Query("select e from Etablissement e where e.nomEtab like %?1 and e.region > ?2")
	List<Etablissement> findByNomEtabRegion (String nomEtab, String region);
	
	@Query("select e from Etablissement e order by e.nomEtab ASC, e.typeEtab ASC")
	List<Etablissement> trierEtablissementNomType();

}
