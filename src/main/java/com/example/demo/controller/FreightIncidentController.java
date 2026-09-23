package com.example.demo.controller;

import com.example.demo.model.FreightIncident;
import com.example.demo.repository.IFreightIncidentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/incidents")
@RequiredArgsConstructor
public class FreightIncidentController {

    private final IFreightIncidentRepository freightIncidentRepository;

    @GetMapping
    public List<FreightIncident> findAllIncidents() {
        return freightIncidentRepository.findAll();
    }
}
