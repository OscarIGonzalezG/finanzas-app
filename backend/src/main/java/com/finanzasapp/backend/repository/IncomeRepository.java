package com.finanzasapp.backend.repository;

import com.finanzasapp.backend.entity.Income;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repositorio para acceder a los datos de los ingresos (Income) en la base de datos.
 * Extiende JpaRepository para tener acceso a métodos CRUD
 */
@Repository
public interface IncomeRepository extends JpaRepository<Income, Long> {

    /**
     * Obtiene todos los ingresos asociados a una persona específica.
     *
     * @param personId ID de la persona
     * @return Lista de ingresos de esa persona.
     */
    List<Income> findByPersonId(Long personId);
}
