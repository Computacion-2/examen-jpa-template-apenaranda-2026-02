package com.example.demo.controller;

import com.example.demo.model.Warehouse;
import com.example.demo.repository.IWarehouseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/warehouses")
@RequiredArgsConstructor
public class WarehouseController {

    private final IWarehouseRepository warehouseRepository;

    @GetMapping
    public List<Warehouse> findAllWarehouses() {
        return warehouseRepository.findAll();
    }
}
