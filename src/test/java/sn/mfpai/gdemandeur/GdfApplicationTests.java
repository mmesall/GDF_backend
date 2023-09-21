package sn.mfpai.gdemandeur;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import sn.mfpai.gdemandeur.entities.Formation;
import sn.mfpai.gdemandeur.repos.FormationRepository;

@SpringBootTest
class GdfApplicationTests {


	@Autowired
	private FormationRepository formationRepository;
	
	@Test
	public void testCreateFormation() {
	Formation form1 = new Formation("CAP Menuiserie","initiale","3 ans",
			"concours","bac");
	formationRepository.save(form1);
	}
	
	@Test
	public void testFindFormation()
	{
		Formation f = formationRepository.findById(1L).get(); 
	System.out.println(f);
	}
	
	@Test
	public void testUpdateFormation()
	{
	Formation f = formationRepository.findById(1L).get();
	f.setNomFormation("CAP COUTURE");
	formationRepository.save(f);
	System.out.println(f);
	}
	
	@Test
	public void testDeleteFormation()
	{
		formationRepository.deleteById(1L);
	}
	
	@Test
	public void testFindAllFormations()
	{
		List<Formation> forms = formationRepository.findAll();
		
		for(Formation f:forms)
			System.out.println(f);
	}
	
	@Test
	public void testFindFormationByNom()
	{
		List<Formation> forms = formationRepository.findByNomFormation("Bts Industrie");
		
		for(Formation f:forms)
			System.out.println(f);
	}
	
	@Test
	public void testFindFormationByNomConstains()
	{
		List<Formation> forms = formationRepository.findByNomFormationContains("CAP");
		
		for(Formation f:forms)
			System.out.println(f);
	}
	
	@Test
	public void testfindByNomDuree()
	{
	List<Formation> forms = formationRepository.findByNomDuree("Bts Industrie", "3 ans");
	for (Formation f : forms)
		{
			System.out.println(f);
		}
	}
	
	@Test
	public void testfindByOrderByNomFormationAsc()
	{
	List<Formation> forms = formationRepository.findByOrderByNomFormationAsc();
	
	for (Formation f : forms)
		{
			System.out.println(f);
		}
	}
	
	@Test
	public void testTrierFormationsNomsDuree()
	{
	List<Formation> forms = formationRepository.trierFormationsNomsDuree();
	
		for (Formation f : forms)
		{
			System.out.println(f);
		}
	}
	
	
}
