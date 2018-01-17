package hr.biljeznica.SpringDataJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import hr.biljeznica.model.UserRole;

@Repository
public interface AuthoritiesRepository extends JpaRepository<UserRole, Integer> {
	
	@Query("SELECT CASE WHEN COUNT(r) > 0 THEN true ELSE false END" + 
	" FROM UserRole r WHERE r.username = :username AND r.role = 'ROLE_ADMIN'")
	boolean hasAdminRole(@Param("username") String username);
}
