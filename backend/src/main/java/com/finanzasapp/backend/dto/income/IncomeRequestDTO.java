package com.finanzasapp.backend.dto.income;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import java.math.BigDecimal;


/**
 * DTO de solicitud para crear un nuevo ingreso (Income).
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class IncomeRequestDTO {

    /**
     * Descripción del ingreso (por ejemplo: sueldo, venta, etc.).
     */
    @Schema(description = "Descripción del ingreso", example = "Pago mensual del trabajo")
    @NotNull(message = "La descripción es obligatoria")
    private String description;

    /**
     * Monto recibido como ingreso.
     */
    @Schema(description = "Monto del ingreso", example = "500000.00")
    @NotNull(message = "El monto es obligatorio")
    @Positive(message = "El monto debe ser positivo")
    private BigDecimal amount;

    /**
     * Identificador de la persona a quien pertenece el ingreso.
     */
    @Schema(description = "ID de la persona dueña del ingreso", example = "1")
    @NotNull(message = "El ID de la persona es obligatorio")
    private Long personId;
}
