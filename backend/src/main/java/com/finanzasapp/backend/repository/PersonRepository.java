package com.finanzasapp.backend.repository;

import com.finanzasapp.backend.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio para acceder a los datos de la entidad Person.
 * Extiende JpaRepository para obtener funcionalidades CRUD básicas.
 */

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
