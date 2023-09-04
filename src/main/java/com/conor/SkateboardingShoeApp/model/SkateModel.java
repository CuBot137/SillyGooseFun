package com.conor.SkateboardingShoeApp.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "SkateShoes")
public class SkateModel {

    @Id
    @SequenceGenerator(name="url_id_sequence", sequenceName = "url_id_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "url_id_sequence")
    private Long id;

    private String name;
    private String brand;

    public SkateModel(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

}
