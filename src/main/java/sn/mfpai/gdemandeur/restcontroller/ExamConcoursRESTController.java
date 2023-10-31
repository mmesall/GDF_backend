package sn.mfpai.gdemandeur.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sn.mfpai.gdemandeur.entities.Exam_Concours;
import sn.mfpai.gdemandeur.service.ExamConcoursService;

@RestController
@RequestMapping("/exam_Concourses")
@CrossOrigin
public class ExamConcoursRESTController {
	
	@Autowired(required=true)
	ExamConcoursService examConcoursService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Exam_Concours> getAllExamConcours(){
		return examConcoursService.getAllExamConcours();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Exam_Concours getExamConcoursById(@PathVariable("id") Long id) {
		return examConcoursService.getExamConcours(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Exam_Concours createExamConcours(@RequestBody Exam_Concours exc) 
	{
		return examConcoursService.saveExamConcours(exc);		
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Exam_Concours updateExamConcours(@RequestBody Exam_Concours exc) 
	{
		return examConcoursService.updateExamConcours(exc);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteExamConcours(@PathVariable("id") Long id)
	{
		examConcoursService.deleteExamConcoursById(id);
	}
}
