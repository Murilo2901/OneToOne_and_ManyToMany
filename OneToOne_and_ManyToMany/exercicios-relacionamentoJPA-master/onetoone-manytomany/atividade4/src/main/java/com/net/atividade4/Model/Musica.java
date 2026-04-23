package com.net.atividade4.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Musica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String artista;
}