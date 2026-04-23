package com.net.atividade3.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import com.net.atividade3.Model.Aluno;
import com.net.atividade3.Model.Curso;
import com.net.atividade3.Service.MatriculaService;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class MatriculaController {

    private final MatriculaService service;

    @PostMapping("/alunos")
    public Aluno criarAluno(@RequestBody Aluno aluno) {
        return service.criarAluno(aluno);
    }

    @PostMapping("/cursos")
    public Curso criarCurso(@RequestBody Curso curso) {
        return service.criarCurso(curso);
    }

    @PostMapping("/matricular")
    public String matricular(@RequestParam Long alunoId,
                             @RequestParam Long cursoId) {

        service.matricular(alunoId, cursoId);
        return "Aluno matriculado com sucesso!";
    }

    @GetMapping("/alunos/{id}")
    public Aluno buscarAluno(@PathVariable Long id) {
        return service.buscarAluno(id);
    }

    @GetMapping("/cursos/{id}")
    public Curso buscarCurso(@PathVariable Long id) {
        return service.buscarCurso(id);
    }
}