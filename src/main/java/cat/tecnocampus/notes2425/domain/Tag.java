package cat.tecnocampus.notes2425.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "Tag")
public record Tag(
        @Id
        String name
) {}
