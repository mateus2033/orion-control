package com.api.orioncontrol.repositories;

import java.util.UUID;
import com.api.orioncontrol.models.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {

    boolean existsByLicensePlateCar(String licensePlateCar);
    boolean existsByParkingSpotNumber(String spotNumber);
    boolean existsByApartmentAndBlock(String apartment, String Block);
}
