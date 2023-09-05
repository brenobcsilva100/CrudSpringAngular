package com.example.crudspringangular.persistence.repository;

import com.example.crudspringangular.persistence.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor,Long> {
}
