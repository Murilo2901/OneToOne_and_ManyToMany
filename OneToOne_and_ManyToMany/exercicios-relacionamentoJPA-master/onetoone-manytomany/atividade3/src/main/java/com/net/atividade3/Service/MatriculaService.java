package com.net.atividade3.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.net.atividade3.Repository.AlunoRepository;
import com.net.atividade3.Model.Aluno;
import com.net.atividade3.Model.Curso;
import com.net.atividade3.Repository.CursoRepository;

@Service
@RequiredArgsConstructor
public class MatriculaService {

    private final AlunoRepository alunoRepo;
    private final CursoRepository cursoRepo;

    public Aluno criarAluno(Aluno aluno) {
        return alunoRepo.save(aluno);
    }

    public Curso criarCurso(Curso curso) {
        return cursoRepo.save(curso);
    }

    public void matricular(Long alunoId, Long cursoId) {

        Aluno aluno = alunoRepo.findById(alunoId)
                .orElseThrow(() -> new RuntimeException("Aluno não encontrado"));

        Curso curso = cursoRepo.findById(cursoId)
                .orElseThrow(() -> new RuntimeException("Curso não encontrado"));

        if (!aluno.getCursos().contains(curso)) {
            aluno.getCursos().add(curso);
        }

        alunoRepo.save(aluno);
    }

    public Aluno buscarAluno(Long id) {
        return alunoRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
    }

    public Curso buscarCurso(Long id) {
        return cursoRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Curso não encontrado"));
    }
}