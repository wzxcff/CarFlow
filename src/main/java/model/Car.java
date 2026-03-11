package model;

import jakarta.persistence.*;
import lombok.Data;
import model.enums.CarStatus;

import java.util.UUID;

@Data
@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String brand;
    private String model;
    private String vinNumber;

    @Enumerated(EnumType.STRING)
    private CarStatus status = CarStatus.AVAILABLE;
    private long mileage;
}

