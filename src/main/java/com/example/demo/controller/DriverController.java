package com.example.demo.controller;

import com.example.demo.model.Driver;
import com.example.demo.repository.IDriverRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/drivers")
@RequiredArgsConstructor
public class DriverController {

    private final IDriverRepository driverRepository;

    @GetMapping
    public List<Driver> findAllDrivers() {
        return driverRepository.findAll();
    }
}
