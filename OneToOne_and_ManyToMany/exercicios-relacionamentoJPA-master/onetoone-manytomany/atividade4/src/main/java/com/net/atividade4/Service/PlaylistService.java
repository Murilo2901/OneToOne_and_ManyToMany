package com.net.atividade4.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.net.atividade4.Model.Musica;
import com.net.atividade4.Model.Playlist;
import com.net.atividade4.Repository.MusicaRepository;
import com.net.atividade4.Repository.PlaylistRepository;

@Service
@RequiredArgsConstructor
public class PlaylistService {

    private final PlaylistRepository playlistRepo;
    private final MusicaRepository musicaRepo;

    public Musica criarMusica(Musica musica) {
        return musicaRepo.save(musica);
    }

    public Playlist criarPlaylist(Playlist playlist) {
        return playlistRepo.save(playlist);
    }

    public Playlist adicionarMusica(Long playlistId, Long musicaId) {

        Playlist playlist = playlistRepo.findById(playlistId)
                .orElseThrow(() -> new RuntimeException("Playlist não encontrada"));

        Musica musica = musicaRepo.findById(musicaId)
                .orElseThrow(() -> new RuntimeException("Música não encontrada"));

        if (!playlist.getMusicas().contains(musica)) {
            playlist.getMusicas().add(musica);
        }

        return playlistRepo.save(playlist);
    }

    public Playlist buscarPlaylist(Long id) {
        return playlistRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Playlist não encontrada"));
    }

    public void deletarPlaylist(Long id) {
        playlistRepo.deleteById(id);
    }
}