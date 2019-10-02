package ch.bbw.databaseservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ch.bbw.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	//Repository User
	
}
