package com.abs.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.abs.entities.Seance;
@Service
public interface SeanceRepository extends JpaRepository<Seance, Integer>{

}

