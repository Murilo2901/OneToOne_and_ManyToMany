package com.net.atividade4.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.net.atividade4.Model.Playlist;

public interface PlaylistRepository extends JpaRepository<Playlist, Long> {
}