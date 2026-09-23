package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "freight_incidents")
public class FreightIncident {

    @Id
    private Long id;

    @Column(name = "incident_code", nullable = false, unique = true)
    private String incidentCode;

    @Column(name = "incident_type", nullable = false)
    private String incidentType;

    @Column(nullable = false)
    private String description;

    @Column(name = "logged_at", nullable = false)
    private LocalDateTime loggedAt;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "package_id", nullable = false)
    private CargoPackage packageItem;

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "driver_id", nullable = false)
    private List<Driver> assignedDrivers;
}
