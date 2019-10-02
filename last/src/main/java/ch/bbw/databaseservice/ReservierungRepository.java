package ch.bbw.databaseservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ch.bbw.model.Reservierung;

@Repository
public interface ReservierungRepository extends JpaRepository<Reservierung, Integer> {
	
	//Repository Reservierung
		
}
