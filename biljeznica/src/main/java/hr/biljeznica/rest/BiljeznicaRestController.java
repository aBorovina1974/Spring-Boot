package hr.biljeznica.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hr.biljeznica.SpringDataJPA.repositories.BiljeznicaRepository;
import hr.biljeznica.model.Biljeznica;

@RestController
@RequestMapping("/api/biljeznica")
public class BiljeznicaRestController {
	
	@Autowired
	BiljeznicaRepository biljeznicaRepository;

	@GetMapping
	public List<Biljeznica> findAll()
	{
		return biljeznicaRepository.findAll();
	}
	
	@GetMapping("/{naziv}")
	public Biljeznica findOne(@PathVariable String naziv)
	{
		return biljeznicaRepository.findOne(naziv);
	}
}
