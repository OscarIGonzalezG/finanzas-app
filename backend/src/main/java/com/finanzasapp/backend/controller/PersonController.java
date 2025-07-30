package com.finanzasapp.backend.controller;

import com.finanzasapp.backend.entity.Person;
import com.finanzasapp.backend.service.PersonService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador REST para gestionar personas.
 * Expone endpoints para operaciones CRUD.
 */
@RestController
@RequestMapping("/api/persons")
@Tag(name = "Personas", description = "Operaciones relacionadas con personas")
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService){
        this.personService = personService;
    }

    /**
     * Obtener todas las personas registradas.
     *
     * @return lista de personas
     */
    @GetMapping
    @Operation(summary = "Listar personas", description = "Obtiene una lista de todas las personas registradas.")
    public ResponseEntity<List<Person>> getAllPersons(){
        return ResponseEntity.ok(personService.getAll());
    }

    /**
     * Obtener una persona por su ID.
     *
     * @param id ID de la persona
     * @return persona encontrada o 404 si no existe
     */
    @GetMapping("/{id}")
    @Operation(summary = "Obtener persona por ID", description = "Devuelve una persona específica según su ID.")
    public ResponseEntity<Person> getPersonById(@PathVariable Long id){
        Person person = personService.getById(id);
        if (person == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(person);
    }

    /**
     * Crea una nueva persona.
     *
     * @param person objeto persona recibido en el cuerpo del request
     * @return persona creada
     */
    @PostMapping
    @Operation(summary = "Crear persona", description = "Crea una nueva persona con los datos enviados.")
    public ResponseEntity<Person> createPerson(@RequestBody Person person){
        Person saved = personService.create(person);
        return ResponseEntity.ok(saved);
    }

    /**
     * Elimina una persona por su ID.
     *
     * @param id ID de la persona a eliminar
     * @return respuesta sin contenido
     */
    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar persona", description = "Elimina una persona según su ID.")
    public ResponseEntity<Void> deletePerson(@PathVariable Long id){
        personService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
