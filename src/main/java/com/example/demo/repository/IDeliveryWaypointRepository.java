package com.example.demo.repository;

import com.example.demo.model.DeliveryWaypoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDeliveryWaypointRepository extends JpaRepository<DeliveryWaypoint, Long> {

}
