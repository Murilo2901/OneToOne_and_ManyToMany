package com.net.atividade5.Controller;

import com.net.atividade5.DTO.UsuarioDTO;
import com.net.atividade5.Model.Livro;
import com.net.atividade5.Model.Usuario;
import com.net.atividade5.Service.BibliotecaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class BibliotecaController {

    private final BibliotecaService service;

    @PostMapping("/usuarios")
    public Usuario criarUsuario(@RequestBody UsuarioDTO dto) {
        return service.criarUsuario(dto);
    }

    @PostMapping("/livros")
    public Livro criarLivro(@RequestBody Livro livro) {
        return service.criarLivro(livro);
    }

    @PostMapping("/emprestar")
    public String emprestar(@RequestParam Long usuarioId,
                            @RequestParam Long livroId) {

        service.emprestar(usuarioId, livroId);
        return "Livro emprestado com sucesso!";
    }

    @GetMapping("/usuarios/{id}")
    public Usuario buscar(@PathVariable Long id) {
        return service.buscarUsuario(id);
    }
}