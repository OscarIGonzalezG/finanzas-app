package com.finanzasapp.backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


/**
 * Representa a la persona propietaria de las finanzas.
 * Esta entidad almacena información básica como el nombre completo
 * y la fecha de creación del registro.
 */
@Entity
@Table(name = "person")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Person {

    /**
     * Identificador único de la persona (autogenerado).
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Nombre de la persona.
     */
    @Column(nullable = false)
    private String name;

    /**
     * Fecha y hora en que se creó el registro.
     * Se asigna automáticamente al momento de persistir.
     */
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    /**
     * Asigna la fecha actual antes de guardar por primera vez.
     */
    @PrePersist
    public void prePersist(){
        this.createdAt = LocalDateTime.now();
    }
}
