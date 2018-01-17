package hr.biljeznica.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hr.biljeznica.SpringDataJPA.repositories.KorisnikRepository;
import hr.biljeznica.model.Korisnik;

@RestController
@RequestMapping("/api/korisnik")
public class KorisnikRestController {
	
	@Autowired
	KorisnikRepository korisnikRepository;
	
	@GetMapping
	public List<Korisnik> findAll()
	{
		return korisnikRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Korisnik findOne(@PathVariable Integer id)
	{
		return korisnikRepository.findOne(id);
	}
	

}
