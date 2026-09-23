-- ==========================================================
-- SCRIPT DE INICIALIZACIÓN DE DATOS: SMART FREIGHT LOGISTICS (TEMPLATE)
-- ==========================================================

-- 1. CARGO PACKAGES
INSERT INTO cargo_packages (id, tracking_number, weight_kg, declared_value, is_fragile, status, route_id) VALUES
(1, 'TRK-COL-1092', 32.0, 4500.0, true, 'IN_TRANSIT', 2),
(2, 'TRK-COL-3381', 48.5, 7800.0, true, 'IN_TRANSIT', 2),
(3, 'TRK-COL-5542', 28.0, 3200.0, true, 'PENDING', 2),
(4, 'TRK-COL-1105', 15.0, 1200.0, true, 'IN_TRANSIT', 2),
(5, 'TRK-COL-9021', 120.0, 15000.0, false, 'IN_TRANSIT', 1),
(6, 'TRK-COL-4412', 85.0, 9500.0, false, 'IN_TRANSIT', 1),
(7, 'TRK-COL-7733', 60.0, 6200.0, true, 'IN_TRANSIT', 3),
(8, 'TRK-COL-8890', 40.0, 5100.0, true, 'DELIVERED', 4),
(9, 'TRK-COL-9901', 50.0, 4000.0, true, 'IN_TRANSIT', 5);

-- 2. FREIGHT INCIDENTS
INSERT INTO freight_incidents (id, incident_code, incident_type, description, severity_level, cost_estimate, logged_at, package_id, driver_id) VALUES
(1, 'INC-1001', 'MECHANICAL_FAILURE', 'Fallo en frenos de tractomula', 3, 2100.0, '2026-03-18 10:00:00', 5, 1),
(2, 'INC-1002', 'MECHANICAL_FAILURE', 'Averia de unidad termorreguladora', 2, 1600.0, '2026-03-12 14:30:00', 6, 2),
(3, 'INC-7721', 'WEATHER_DELAY', 'Retraso por derrumbe en via', 4, 2400.0, '2026-03-19 16:20:00', 7, 1),
(4, 'INC-8834', 'CUSTOMS_DELAY', 'Demora en aduana puerto Buenaventura', 3, 1850.0, '2026-03-20 11:00:00', 8, 2),
(5, 'INC-5510', 'CARGO_DAMAGE', 'Dano parcial de embalaje por frenado brusco', 2, 800.0, '2026-03-15 09:10:00', 1, 4),
(6, 'INC-9900', 'SECURITY_ALERT', 'Alerta de intento de apertura de contenedor', 5, 5000.0, '2026-03-22 18:00:00', 2, 3),
(7, 'INC-1007', 'MECHANICAL_FAILURE', 'Pinchazo doble en eje trasero', 1, 500.0, '2026-03-14 08:00:00', 7, 5);

-- 3. WAREHOUSES
INSERT INTO warehouses (id, code, city, country, capacity_sqm, contact_email) VALUES
(1, 'WH-BOG-01', 'Bogota', 'Colombia', 15000.0, 'contact-bogota@smartlogistics.com'),
(2, 'WH-MDE-02', 'Medellin', 'Colombia', 12000.0, 'contact-medellin@smartlogistics.com'),
(3, 'WH-CLI-03', 'Cali', 'Colombia', 10500.0, 'contact-cali@smartlogistics.com'),
(4, 'WH-BAQ-04', 'Barranquilla', 'Colombia', 8500.0, 'contact-barranquilla@smartlogistics.com'),
(5, 'WH-UIO-05', 'Quito', 'Ecuador', 9000.0, 'contact-quito@smartlogistics.ec');

-- 4. SHIPMENT ROUTES
INSERT INTO shipment_routes (id, route_code, estimated_hours, distance_km, is_active, origin_warehouse_id, destination_warehouse_id) VALUES
(1, 'BOG-MED-01', 9.5, 420.0, true, 1, 2),
(2, 'BOG-CLI-04', 11.0, 480.0, true, 1, 3),
(3, 'MDE-BAQ-03', 14.5, 710.0, true, 2, 4),
(4, 'BOG-UIO-08', 22.0, 1150.0, true, 1, 5),
(5, 'CLI-BAQ-05', 18.0, 980.0, false, 3, 4);

-- 5. DRIVERS
INSERT INTO drivers (id, license_number, full_name, email, category, years_experience) VALUES
(1, 'LIC-COL-8801', 'Carlos Mendoza', 'cmendoza@smartlogistics.com', 'HAZMAT', 8),
(2, 'LIC-COL-8802', 'Andres Gutierrez', 'agutierrez@smartlogistics.com', 'HEAVY_TRUCK', 6),
(3, 'LIC-COL-8803', 'Mauricio Ospina', 'mospina@smartlogistics.com', 'HAZMAT', 9),
(4, 'LIC-COL-8804', 'Javier Ramirez', 'jramirez@smartlogistics.com', 'VAN', 3),
(5, 'LIC-COL-8805', 'Fernando Castro', 'fcastro@smartlogistics.com', 'HEAVY_TRUCK', 4),
(6, 'LIC-COL-8806', 'Jorge Valencia', 'jvalencia@smartlogistics.com', 'HEAVY_TRUCK', 7);

-- 6. VEHICLES
INSERT INTO vehicles (id, plate_number, max_payload_kg, model_year, is_refrigerated, driver_id) VALUES
(1, 'TLG-101', 32000.0, 2024, true, 1),
(2, 'TLG-202', 28000.0, 2023, false, 2),
(3, 'TLG-303', 35000.0, 2025, false, 3),
(4, 'VAN-404', 5000.0, 2022, false, 4),
(5, 'TLG-505', 30000.0, 2021, false, 5),
(6, 'TLG-606', 34000.0, 2024, true, 6);

-- 7. DELIVERY WAYPOINTS
INSERT INTO delivery_waypoints (id, checkpoint_name, sequence_order, arrival_time, departure_time, route_id, vehicle_id) VALUES
(1, 'Control Peaje Chicoral - RUTA-01', 1, '2026-03-21 08:30:00', '2026-03-21 09:00:00', 1, 1),
(2, 'Punto Fronterizo Rumichaca - RUTA-08', 2, '2026-03-22 14:15:00', '2026-03-22 15:30:00', 4, 3),
(3, 'Paso de la Linea Checkpoint - RUTA-04', 1, '2026-03-21 11:00:00', '2026-03-21 11:45:00', 2, 6),
(4, 'Control Guaduas - RUTA-01 Antiguo', 1, '2026-03-10 07:00:00', '2026-03-10 07:30:00', 1, 1),
(5, 'Terminal de Carga Yumbo - RUTA-04', 2, '2026-03-21 17:00:00', '2026-03-21 18:00:00', 2, 1),
(6, 'Control Planeta Rica - RUTA-03', 1, '2026-03-22 10:00:00', '2026-03-22 10:40:00', 3, 5);
