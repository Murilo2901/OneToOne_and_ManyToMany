package com.net.atividade2.Repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import com.net.atividade2.Model.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}