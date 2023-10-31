package sn.mfpai.gdemandeur.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import sn.mfpai.gdemandeur.entities.Bailleur;

public interface BailleurRepository extends JpaRepository<Bailleur, Long>{
	
	List<Bailleur> findByNomProjet(String nom);
	
	List<Bailleur> findByNomProjetContains(String nom);

	/*@Query("select b from Bailleur b where b.nomProjet like %:nom and b.nbrePC > :nbre") 
	List<Bailleur> findByNomProjetNbrePC(@Param("nomProjet") String nom,@Param("nbrePC") int nbre);*/

	List<Bailleur> findByOrderByNomProjetAsc();
	
	@Query("select b from Bailleur b order by b.nomProjet ASC, b.nbrePC ASC")
	List<Bailleur> trierBailleursNomsNbrePC();
}
