package com.example.rentvideoII.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="videos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String title;
    private String director;

    private String genre;
    private Boolean available;

}
