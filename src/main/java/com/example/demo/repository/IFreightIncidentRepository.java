package com.example.demo.repository;

import com.example.demo.model.FreightIncident;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFreightIncidentRepository extends JpaRepository<FreightIncident, Long> {

}
