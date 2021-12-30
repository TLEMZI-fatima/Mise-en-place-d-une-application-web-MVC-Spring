package com.abs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abs.entities.Absence;

public interface AbsenceRepository extends JpaRepository<Absence, Integer>{

}
