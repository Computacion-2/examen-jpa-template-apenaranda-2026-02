package com.example.demo.repository;

import com.example.demo.model.ShipmentRoute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IShipmentRouteRepository extends JpaRepository<ShipmentRoute, Long> {

}
