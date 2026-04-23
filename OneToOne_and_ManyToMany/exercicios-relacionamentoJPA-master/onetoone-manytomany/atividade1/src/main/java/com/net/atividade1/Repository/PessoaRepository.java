package com.net.atividade1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.net.atividade1.Model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {}