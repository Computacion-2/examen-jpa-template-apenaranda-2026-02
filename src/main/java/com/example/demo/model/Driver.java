package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "drivers")
public class Driver {

    @GeneratedValue()
    private Long id;

    @Column(name = "license_number", nullable = false, unique = true)
    private String licenseNumber;

    @Column(name = "full_name", nullable = false)
    private String category;

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false)
    private String email;

    @Column(name = "years_experience", nullable = false)
    private Integer yearsExperience;

    @ManyToOne(mappedBy = "driver", cascade = CascadeType.ALL)
    private List<Vehicle> vehicles;

    @ManyToOne(mappedBy = "driver", cascade = CascadeType.ALL)
    private List<FreightIncident> reportedIncidents;
}
