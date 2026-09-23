package com.example.demo.controller;

import com.example.demo.model.ShipmentRoute;
import com.example.demo.repository.IShipmentRouteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/routes")
@RequiredArgsConstructor
public class ShipmentRouteController {

    private final IShipmentRouteRepository shipmentRouteRepository;

    @GetMapping
    public List<ShipmentRoute> findAllRoutes() {
        return shipmentRouteRepository.findAll();
    }
}
