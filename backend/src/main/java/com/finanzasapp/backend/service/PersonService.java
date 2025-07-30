package com.finanzasapp.backend.service;

import com.finanzasapp.backend.entity.Person;

import java.util.List;

/**
 * Interfaz del servicio de persona.
 * Define las operaciones que se pueden realizar sobre la entidad Person
 */
public interface PersonService {

    /**
     * Obtiene la lista de todas las personas.
     *
     * @return lista de personas.
     */
    List<Person> getAll();

    /**
     * Obtener una persona por su ID.
     *
     * @param id identificador de la persona
     * @return persona encontrada o null si no existe
     */
    Person getById(Long id);

    /**
     * Crea una nueva persona.
     *
     * @param person objeto persona a guardar
     * @return persona guardada
     */
    Person create(Person person);

    /**
     * Elimina una persona por si ID.
     *
     * @param id identificador de la persona a eliminar
     */
    void delete(Long id);
}
