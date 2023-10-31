package sn.mfpai.gdemandeur;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import sn.mfpai.gdemandeur.entities.Exam_Concours;
import sn.mfpai.gdemandeur.entities.Formation;
import sn.mfpai.gdemandeur.repos.ExamConcoursRepository;
import sn.mfpai.gdemandeur.repos.FormationRepository;

@SpringBootTest
class GdfApplicationTests {


	@Autowired
	private FormationRepository formationRepository;
	private ExamConcoursRepository examConcoursRepository;
	
	/*@Test
	public void testCreateFormation() {
	Formation form1 = new Formation("CAP Menuiserie bois","initiale","3 ans",
			"concours","bac", null, null);
	formationRepository.save(form1);
	}*/
	
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
	
	@Test
	public void testfindByExamConcours()
	{
		Exam_Concours exconc = new Exam_Concours();
		exconc.setIdExConc(1L);
		
		List<Formation> forms = formationRepository.findByExamConcours(exconc);
		for (Formation f : forms)
		{
			System.out.println(f);
		}
	}
	
	
	@Test
	public void findByExamConcoursIdExConc()
	{
		List<Formation> forms = formationRepository.findByExamConcoursIdExConc(1L);
		
		for (Formation f : forms)
		{
		System.out.println(f);
		}
	}
	
	@Test
	public void findExamConcoursByNomExConcours() {
		List<Exam_Concours> exc = examConcoursRepository.findByNomExConcours("Concours d'entrée en 1ere année en BTS industrie");
		
		for(Exam_Concours exc1: exc)
			
			System.out.println(exc1);
	}
	
	@Test
	public void testFindExamConcours()
	{
		Exam_Concours exc = examConcoursRepository.findById(1L).get();
	
		System.out.println(exc);
	}
	
	@Test
	public void testCreateExamConcours() {
	Exam_Concours exc = new Exam_Concours("Examen en CAP Menuiserie","E",new Date(),
			"bfem", new Date(),new Date(), null);
	examConcoursRepository.save(exc);
	}
	
	
}
