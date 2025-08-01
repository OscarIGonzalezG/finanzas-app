package com.finanzasapp.backend.service.impl;

import com.finanzasapp.backend.dto.income.IncomeRequestDTO;
import com.finanzasapp.backend.dto.income.IncomeResponseDTO;
import com.finanzasapp.backend.entity.Income;
import com.finanzasapp.backend.entity.Person;
import com.finanzasapp.backend.repository.IncomeRepository;
import com.finanzasapp.backend.repository.PersonRepository;
import com.finanzasapp.backend.service.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Implementación de la lógica de negocio para ingresos (Income).
 */
@Service
public class IncomeServiceImpl implements IncomeService {

    private final IncomeRepository incomeRepository;
    private final PersonRepository personRepository;

    @Autowired
    public IncomeServiceImpl(IncomeRepository incomeRepository, PersonRepository personRepository){
        this.incomeRepository = incomeRepository;
        this.personRepository = personRepository;
    }

    @Override
    public IncomeResponseDTO createIncome(IncomeRequestDTO dto){
        // Buscar la persona asociada al ingreso
        Optional<Person> personOpt = personRepository.findById(dto.getPersonId());
        if (personOpt.isEmpty()){
            throw new IllegalArgumentException("La persona con ID " + dto.getPersonId() + " no existe.");
        }

        // Construir la entidad de ingreso
        Income income = Income.builder()
                .amount(dto.getAmount())
                .description(dto.getDescription())
                .person(personOpt.get())
                .build();

        // Guardar y retornar con DTO
        Income saved = incomeRepository.save(income);

        return mapToDTO(saved);
    }

    @Override
    public List<IncomeResponseDTO> getAllIncomes() {
        return incomeRepository.findAll()
                .stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<IncomeResponseDTO> getIncomesByPersonId(Long personId) {
        return incomeRepository.findByPersonId(personId)
                .stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());
    }

    /**
     * Convierte un objeto Income en IncomeResponseDTO.
     *
     * @param income entidad Income
     * @return IncomeResponseDTO correspondiente
     */
    private IncomeResponseDTO mapToDTO(Income income) {
        return IncomeResponseDTO.builder()
                .id(income.getId())
                .description(income.getDescription())
                .amount(income.getAmount())
                .createdAt(income.getCreatedAt())
                .personName(income.getPerson().getName())
                .build();
    }
}
