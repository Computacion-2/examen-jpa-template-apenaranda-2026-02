package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "shipment_routes")
public class ShipmentRoute {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "route_code", nullable = false)
    private String routeCode;

    @Column(name = "estimated_hours", nullable = false)
    private Double estimatedHours;

    @Column(name = "distance_km", nullable = false)
    private Double distanceKm;

    @Column(name = "is_active", nullable = false)
    private Boolean isActive;

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "origin_warehouse_id", nullable = false)
    private List<Warehouse> originWarehouse;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "destination_warehouse_id")
    private Warehouse destinationWarehouse;
}
