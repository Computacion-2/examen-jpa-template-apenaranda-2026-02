package com.example.demo.controller;

import com.example.demo.model.Vehicle;
import com.example.demo.repository.IVehicleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
@RequiredArgsConstructor
public class VehicleController {

    private final IVehicleRepository vehicleRepository;

    @GetMapping
    public List<Vehicle> findAllVehicles() {
        return vehicleRepository.findAll();
    }
}
