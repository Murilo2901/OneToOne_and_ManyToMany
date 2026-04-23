package com.net.atividade5.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.net.atividade5.Model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}