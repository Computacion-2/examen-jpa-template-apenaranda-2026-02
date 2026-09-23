package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "warehouses")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Warehouse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String code;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String country;

    @Column(name = "capacity_sqm", nullable = false)
    private Double capacitySqm;

    @Column(name = "contact_email", nullable = false)
    private String contactEmail;

    @OneToMany(mappedBy = "originWarehouse", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    @Builder.Default
    private List<ShipmentRoute> outboundRoutes = new ArrayList<>();

    @OneToMany(mappedBy = "destinationWarehouse", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    @Builder.Default
    private List<ShipmentRoute> inboundRoutes = new ArrayList<>();
}
