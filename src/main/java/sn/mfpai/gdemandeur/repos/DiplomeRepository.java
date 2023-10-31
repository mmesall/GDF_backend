package sn.mfpai.gdemandeur.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sn.mfpai.gdemandeur.entities.Diplome;

public interface DiplomeRepository extends JpaRepository<Diplome, Long>{
	
	List<Diplome> findByNomDiplome(String nom);
	
	List<Diplome> findByNomDiplomeContains(String nom);

	@Query("select dip from Diplome dip where dip.nomDiplome like %:nom and dip.lieuObtention > :lieu") 
	List<Diplome> findByNomLieu (@Param("nom") String nom,@Param("lieu") String lieu);

	List<Diplome> findByOrderByDateObtentionAsc();
	
	@Query("select d from Diplome d order by d.nomDiplome ASC, d.dateObtention ASC")
	List<Diplome> trierDiplomesNomsDate();

}
