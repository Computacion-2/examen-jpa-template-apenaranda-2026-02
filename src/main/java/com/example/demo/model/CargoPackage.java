package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cargo_packages")
public class CargoPackage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Double weightKg;

    @Column(name = "tracking_number", nullable = false)
    private String trackingNumber;

    @Column(name = "tracking_code2")
    private String trackingCode2;

    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(name = "declared_value", nullable = false)
    private Double declaredValue;

    @Column(name = "is_fragile", nullable = false)
    private Boolean isFragile;

    @Column(nullable = false)
    private String status;

    @OneToMany(fetch = FetchType.LAZY)
    private ShipmentRoute route;

    @JsonIgnore
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToMany(mappedBy = "packageItem", cascade = CascadeType.ALL)
    private FreightIncident incidents;
}
