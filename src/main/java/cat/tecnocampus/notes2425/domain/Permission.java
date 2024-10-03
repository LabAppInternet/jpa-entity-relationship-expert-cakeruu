package cat.tecnocampus.notes2425.domain;

import jakarta.persistence.*;

@Entity
public record Permission(
        @ManyToOne
        @Id // Maps the "owner" in PermissionId to the actual entity
        @JoinColumn(name = "user_Id")
        UserLab owner,

        @ManyToOne
        @Id // Maps the "note" in PermissionId to the actual entity
        @JoinColumn(name = "note_Id")
        Note note,

        @Column(nullable = false)
        boolean canRead,

        @Column(nullable = false)
        boolean canEdit
) {}
