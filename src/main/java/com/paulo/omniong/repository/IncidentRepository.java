package com.paulo.omniong.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paulo.omniong.model.Incident;

@Repository
public interface IncidentRepository extends JpaRepository<Incident, Long> {

	List<Incident> findByOngId(Long id);

}
