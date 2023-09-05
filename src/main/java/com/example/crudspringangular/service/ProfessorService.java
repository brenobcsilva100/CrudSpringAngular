package com.example.crudspringangular.service;

import com.example.crudspringangular.persistence.model.Professor;
import com.example.crudspringangular.persistence.repository.ProfessorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {

    private final ProfessorRepository professorRepository;

    public ProfessorService(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    public List<Professor> mostrar() {
        return professorRepository.findAll();
    }

    public Professor salvar(Professor professor) {
        return professorRepository.save(professor);
    }
}
