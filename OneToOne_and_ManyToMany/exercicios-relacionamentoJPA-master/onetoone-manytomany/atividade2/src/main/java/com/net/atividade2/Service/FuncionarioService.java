package com.net.atividade2.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.net.atividade2.DTO.FuncionarioDTO;
import com.net.atividade2.Model.Endereco;
import com.net.atividade2.Model.Funcionario;
import com.net.atividade2.Repositoy.FuncionarioRepository;

@Service
@RequiredArgsConstructor
public class FuncionarioService {

    private final FuncionarioRepository repository;

    public Funcionario salvar(FuncionarioDTO dto) {

        Funcionario f = new Funcionario();
        f.setNome(dto.getNome());

        Endereco e = new Endereco();
        e.setRua(dto.getRua());
        e.setNumero(dto.getNumero());

        e.setFuncionario(f);
        f.setEndereco(e);

        return repository.save(f);
    }

    public Funcionario buscar(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Funcionario não encontrado"));
    }
}