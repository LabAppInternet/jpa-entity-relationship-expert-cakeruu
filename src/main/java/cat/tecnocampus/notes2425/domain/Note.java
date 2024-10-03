package cat.tecnocampus.notes2425.domain;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "Note")
public record Note(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id,

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "owner_id", nullable = false)
        UserLab owner,

        @Column(nullable = false, length = 255)
        String title,

        @Lob
        @Column(nullable = false)
        String content,

        @Column(name = "creation_Date", nullable = false)
        LocalDateTime creationDate,

        @ManyToMany
        @JoinTable(
                name = "Note_Tag",
                joinColumns = @JoinColumn(name = "note_id"),
                inverseJoinColumns = @JoinColumn(name = "tag_name")
        )
        Set<Tag> tags
) {}

