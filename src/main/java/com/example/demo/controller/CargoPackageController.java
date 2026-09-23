package com.example.demo.controller;

import com.example.demo.model.CargoPackage;
import com.example.demo.repository.ICargoPackageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/packages")
@RequiredArgsConstructor
public class CargoPackageController {

    private final ICargoPackageRepository cargoPackageRepository;

    @GetMapping
    public List<CargoPackage> findAllPackages() {
        return cargoPackageRepository.findAll();
    }
}
