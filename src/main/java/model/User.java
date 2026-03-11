package model;

import jakarta.persistence.*;
import lombok.Data;
import model.enums.UserRole;

import java.util.UUID;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private String email;

    @Enumerated(EnumType.STRING)
    private UserRole role;
    private String licenseNumber;
}
