package com.finanzasapp.backend.dto.income;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * DTO de respuesta que representa un ingreso registrado en el sistema.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class IncomeResponseDTO {

    /**
     * Identificador único del ingreso.
     */
    @Schema(description = "ID del ingreso", example = "10")
    private Long id;

    /**
     * Descripción del ingreso (ejemplo: sueldo, venta, etc.).
     */
    @Schema(description = "Descripción del ingreso", example = "Pago mensual del trabajo")
    private String description;

    /**
     * Monto recibido como ingreso.
     */
    @Schema(description = "Monto del ingreso", example = "500000.00")
    private BigDecimal amount;

    /**
     * Fecha y hora en que se registró el ingreso.
     */
    @Schema(description = "Fecha de creación del ingreso", example = "2025-07-30T10:45:00")
    private LocalDateTime createdAt;

    /**
     * Nombre de la persona dueña del ingreso.
     */
    @Schema(description = "Nombre de la persona", example = "Oscar González")
    private String personName;
}
