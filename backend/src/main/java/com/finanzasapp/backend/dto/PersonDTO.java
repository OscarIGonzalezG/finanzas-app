package com.finanzasapp.backend.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

/**
 * DTO (Data Transfer Object) para la entidad Person.
 * Este objeto se utiliza para la transferencia segura de datos
 * entre el cliente y el servidor, sin exponer directamente la entidad.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PersonDTO {

    /**
     * Nombre de la persona. No puede estar vacío.
     */
    @NotBlank(message = "El nombre es obligatorio")
    private String name;
}
