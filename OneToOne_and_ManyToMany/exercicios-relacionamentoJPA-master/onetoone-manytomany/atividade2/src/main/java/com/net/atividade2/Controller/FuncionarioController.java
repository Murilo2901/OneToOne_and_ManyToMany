package com.net.atividade2.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import com.net.atividade2.DTO.FuncionarioDTO;
import com.net.atividade2.Model.Funcionario;
import com.net.atividade2.Service.FuncionarioService;

@RestController
@RequestMapping("/funcionarios")
@RequiredArgsConstructor
public class FuncionarioController {

    private final FuncionarioService service;

    @PostMapping
    public Funcionario criar(@RequestBody FuncionarioDTO dto) {
        return service.salvar(dto);
    }

    @GetMapping("/{id}")
    public Funcionario buscar(@PathVariable Long id) {
        return service.buscar(id);
    }
}