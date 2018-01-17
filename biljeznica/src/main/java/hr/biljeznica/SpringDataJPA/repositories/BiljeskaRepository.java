package hr.biljeznica.SpringDataJPA.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hr.biljeznica.model.Biljeska;

@Repository
public interface BiljeskaRepository extends JpaRepository<Biljeska, Integer> {

	List<Biljeska> findByKorisnik_KorisnickoIme(String korisnickoIme);
	
	List<Biljeska> findByKorisnik_KorisnickoImeOrderByNaslovAsc(String korisnickoIme);
	
	List<Biljeska> findByKorisnik_KorisnickoImeOrderByNaslovDesc(String korisnickoIme);
	
	List<Biljeska> findAllByOrderByNaslovAsc();
	
	List<Biljeska> findAllByOrderByNaslovDesc();
}
