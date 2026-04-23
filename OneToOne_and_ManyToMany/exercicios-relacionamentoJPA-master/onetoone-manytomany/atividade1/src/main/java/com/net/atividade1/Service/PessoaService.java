package com.net.atividade1.Service;

import org.springframework.stereotype.Service;
import com.net.atividade1.Model.Pessoa;
import com.net.atividade1.Repository.PessoaRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PessoaService {

    private final PessoaRepository repo;

    public Pessoa salvar(Pessoa pessoa) {
        return repo.save(pessoa);
    }

    public Pessoa buscar(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Pessoa não encontrada"));
    }
}