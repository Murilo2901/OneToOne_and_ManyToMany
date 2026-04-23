package com.net.atividade3.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.net.atividade3.Model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}