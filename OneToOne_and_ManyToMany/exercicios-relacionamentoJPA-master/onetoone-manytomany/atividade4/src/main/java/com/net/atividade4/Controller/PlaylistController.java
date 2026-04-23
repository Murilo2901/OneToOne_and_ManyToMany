package com.net.atividade4.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import com.net.atividade4.Service.PlaylistService;
import com.net.atividade4.Model.Musica;
import com.net.atividade4.Model.Playlist;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class PlaylistController {

    private final PlaylistService service;

    @PostMapping("/musicas")
    public Musica criarMusica(@RequestBody Musica musica) {
        return service.criarMusica(musica);
    }

    @PostMapping("/playlists")
    public Playlist criarPlaylist(@RequestBody Playlist playlist) {
        return service.criarPlaylist(playlist);
    }

    @PostMapping("/playlists/{playlistId}/musicas/{musicaId}")
    public Playlist adicionarMusica(@PathVariable Long playlistId,
                                    @PathVariable Long musicaId) {
        return service.adicionarMusica(playlistId, musicaId);
    }

    @GetMapping("/playlists/{id}")
    public Playlist buscar(@PathVariable Long id) {
        return service.buscarPlaylist(id);
    }

    @DeleteMapping("/playlists/{id}")
    public String deletar(@PathVariable Long id) {
        service.deletarPlaylist(id);
        return "Playlist deletada sem remover músicas";
    }
}