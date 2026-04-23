package com.net.atividade5.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.net.atividade5.Model.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}