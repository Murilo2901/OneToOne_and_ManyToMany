package com.net.atividade5.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.net.atividade5.Model.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long> {
}