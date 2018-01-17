package hr.biljeznica.SpringDataJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hr.biljeznica.model.Biljeznica;

@Repository
public interface BiljeznicaRepository extends JpaRepository<Biljeznica, String> {
	
}
