package cat.tecnocampus.notes2425.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "User_lab")
public record UserLab(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        long id,

        @Column(nullable = false, unique = true, length = 255)
        String username,

        @Column(nullable = false, unique = true, length = 255)
        String email
) {}
