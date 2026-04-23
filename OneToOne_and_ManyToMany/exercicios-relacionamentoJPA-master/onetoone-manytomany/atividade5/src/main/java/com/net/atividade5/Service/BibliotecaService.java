package com.net.atividade5.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.net.atividade5.DTO.UsuarioDTO;
import com.net.atividade5.Model.Contato;
import com.net.atividade5.Model.Livro;
import com.net.atividade5.Model.Usuario;
import com.net.atividade5.Repository.LivroRepository;
import com.net.atividade5.Repository.UsuarioRepository;

@Service
@RequiredArgsConstructor
public class BibliotecaService {

    private final UsuarioRepository usuarioRepo;
    private final LivroRepository livroRepo;

    public Usuario criarUsuario(UsuarioDTO dto) {

        Usuario u = new Usuario();
        u.setNome(dto.getNome());

        Contato c = new Contato();
        c.setEmail(dto.getEmail());
        c.setTelefone(dto.getTelefone());

        u.setContato(c);

        return usuarioRepo.save(u);
    }

    public Livro criarLivro(Livro livro) {
        return livroRepo.save(livro);
    }

    public void emprestar(Long usuarioId, Long livroId) {

        Usuario u = usuarioRepo.findById(usuarioId)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        Livro l = livroRepo.findById(livroId)
                .orElseThrow(() -> new RuntimeException("Livro não encontrado"));

        if (!u.getLivrosEmprestados().contains(l)) {
            u.getLivrosEmprestados().add(l);
        }

        usuarioRepo.save(u);
    }

    public Usuario buscarUsuario(Long id) {
        return usuarioRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }
}