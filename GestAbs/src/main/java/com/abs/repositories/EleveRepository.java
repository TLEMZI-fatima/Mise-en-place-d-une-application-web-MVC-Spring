package com.abs.repositories;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.abs.entities.Eleve;
@Service

public interface EleveRepository extends JpaRepository<Eleve, Integer> {
	
	
	
	
	
}
