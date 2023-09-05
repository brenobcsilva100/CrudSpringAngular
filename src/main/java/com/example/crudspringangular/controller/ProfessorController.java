package com.example.crudspringangular.controller;

import com.example.crudspringangular.persistence.model.Professor;
import com.example.crudspringangular.service.ProfessorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpClient;
import java.util.List;

@RestController
public class ProfessorController {

    private final ProfessorService professorService;

    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }

    @GetMapping
    private ResponseEntity<List<Professor>> mostrarProfessor(){
        return new ResponseEntity<>(professorService.mostrar(), HttpStatus.OK);
    }

    @PostMapping
    private ResponseEntity<Professor> cadatrarProfessor(@RequestBody Professor professor){
        return new ResponseEntity<>(professorService.salvar(professor), HttpStatus.CREATED);
    }

    @PutMapping
    private ResponseEntity<Professor> alterarProfessor(@RequestBody Professor professor){
        return new ResponseEntity<>(professorService.salvar(professor), HttpStatus.OK);
    }


}
