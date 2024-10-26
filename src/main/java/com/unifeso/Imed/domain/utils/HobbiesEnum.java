package com.unifeso.Imed.domain.utils;

import lombok.Getter;

@Getter
public enum HobbiesEnum {
    READING(1, "Leitura"),
    TRAVELING(2, "Viagem"),
    COOKING(3, "Culinária"),
    GARDENING(4, "Jardinagem"),
    PAINTING(5, "Pintura"),
    PHOTOGRAPHY(6, "Fotografia"),
    HIKING(7, "Caminhadas"),
    FISHING(8, "Pesca"),
    PLAYING_MUSIC(9, "Tocar Música"),
    DANCING(10, "Dança"),
    CRAFTING(11, "Artesanato"),
    WRITING(12, "Escrita"),
    PLAYING_VIDEO_GAMES(13, "Jogos Eletrônicos"),
    COLLECTING(14, "Colecionismo"),
    YOGA(15, "Yoga"),
    KNITTING(16, "Tricô"),
    RUNNING(17, "Corrida"),
    SWIMMING(18, "Natação"),
    VOLUNTEERING(19, "Trabalho Voluntário"),
    BOARD_GAMES(20, "Jogos de Tabuleiro");

    private int id;
    private String nome;

    HobbiesEnum(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}
