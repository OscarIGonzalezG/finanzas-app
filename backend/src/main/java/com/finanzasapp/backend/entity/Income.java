package com.finanzasapp.backend.entity;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Representa un ingreso de dinero registrado por una persona.
 * Cada ingreso está relacionado con una persona específica.
 */
@Entity
@Table(name = "incomes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Income {

    /**
     * Identificador único del ingreso (autogenerado).
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Monto del ingreso.
     */
    @Column(nullable = false)
    private BigDecimal amount;

    /**
     * Descripción opcional del ingreso (por ejemplo: salario de enero).
     */
    private String description;

    /**
     * Categoría opcional del ingreso (por ejemplo: salario, regalo, freelance).
     */
    private String category;

    /**
     * Fecha del ingreso registrada por el usuario.
     */
    private LocalDateTime incomeDate;

    /**
     * Fecha de creación automática del registro.
     */
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    /**
     * Persona propietaria del ingreso (relación muchos a uno).
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

    /**
     * Se ejecuta automáticamente antes de insertar el ingreso para definir la fecha de creación.
     */
    @PrePersist
    public void prePersist(){
        this.createdAt = LocalDateTime.now();
    }
}
