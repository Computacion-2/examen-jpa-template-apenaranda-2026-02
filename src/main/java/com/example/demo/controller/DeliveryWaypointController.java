package com.example.demo.controller;

import com.example.demo.model.DeliveryWaypoint;
import com.example.demo.repository.IDeliveryWaypointRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/waypoints")
@RequiredArgsConstructor
public class DeliveryWaypointController {

    private final IDeliveryWaypointRepository deliveryWaypointRepository;

    @GetMapping
    public List<DeliveryWaypoint> findAllWaypoints() {
        return deliveryWaypointRepository.findAll();
    }
}
