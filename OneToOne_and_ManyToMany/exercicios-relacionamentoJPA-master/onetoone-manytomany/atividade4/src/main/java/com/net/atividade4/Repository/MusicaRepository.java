package com.net.atividade4.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.net.atividade4.Model.Musica;

public interface MusicaRepository extends JpaRepository<Musica, Long> {
}