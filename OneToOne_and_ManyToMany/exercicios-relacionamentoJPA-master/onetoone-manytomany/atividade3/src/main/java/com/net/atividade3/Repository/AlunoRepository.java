package com.net.atividade3.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.net.atividade3.Model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}