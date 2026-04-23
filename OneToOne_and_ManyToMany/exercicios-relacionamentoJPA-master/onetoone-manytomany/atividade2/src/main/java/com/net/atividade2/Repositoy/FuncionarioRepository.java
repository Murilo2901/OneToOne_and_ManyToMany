package com.net.atividade2.Repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import com.net.atividade2.Model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}