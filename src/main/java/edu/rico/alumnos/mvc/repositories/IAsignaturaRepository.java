package edu.rico.alumnos.mvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.rico.alumnos.mvc.entities.Asignatura;

public interface IAsignaturaRepository extends JpaRepository<Asignatura, Long> {

}
