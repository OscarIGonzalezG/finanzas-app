package com.finanzasapp.backend.service;

import com.finanzasapp.backend.dto.income.IncomeRequestDTO;
import com.finanzasapp.backend.dto.income.IncomeResponseDTO;

import java.util.List;

/**
 * Interfaz para los servicios relacionados con ingresos (Income).
 */
public interface IncomeService {

    /**
     * Registra un nuevo ingreso
     *
     * @param dto DTO con los datos del ingreso a registrar.
     * @return DTO con los datos del ingreso creado.
     */
    IncomeResponseDTO createIncome(IncomeRequestDTO dto);

    /**
     * Lista todos los ingresos registrados en el sistema.
     *
     * @return lista de ingresos en formato DTO
     */
    List<IncomeResponseDTO> getAllIncomes();

    /**
     * Lista todos los ingresos asociados a una persona específica.
     *
     * @param personId ID de la persona
     * @return lista de ingresos de esa persona
     */
    List<IncomeResponseDTO> getIncomesByPersonId(Long personId);
}
