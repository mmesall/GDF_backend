package sn.mfpai.gdemandeur.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sn.mfpai.gdemandeur.entities.PriseEnCharge;
import sn.mfpai.gdemandeur.service.PriseEnChargeService;

@RestController
@RequestMapping("/priseEnCharge")
@CrossOrigin
public class PriseEnChargeRESTController {
	
	@Autowired
	PriseEnChargeService priseEnChargeService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<PriseEnCharge> getAllPriseEnCharges() {
		return priseEnChargeService.getAllPriseEnCharges();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public PriseEnCharge getPriseEnChargeById(@PathVariable("id") Long id) {
		return priseEnChargeService.getPriseEnCharge(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public PriseEnCharge createPriseEnCharge(@RequestBody PriseEnCharge pc) 
	{
		return priseEnChargeService.savePriseEnCharge(pc);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public PriseEnCharge updatePriseEnCharge(@RequestBody PriseEnCharge pc) 
	{
		return priseEnChargeService.updatePriseEnCharge(pc);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deletePriseEnCharge(@PathVariable("id") Long id)
	{
		priseEnChargeService.deletePriseEnChargeById(id);
	}

}
