package com.unifeso.Imed.domain.utils;

import lombok.Getter;

@Getter
public enum HobbiesEnum {
    READING(0, "Leitura"),
    TRAVELING(1, "Viagem"),
    COOKING(2, "Culinária"),
    GARDENING(3, "Jardinagem"),
    PAINTING(4, "Pintura"),
    PHOTOGRAPHY(5, "Fotografia"),
    HIKING(6, "Caminhadas"),
    FISHING(7, "Pesca"),
    PLAYING_MUSIC(8, "Tocar Música"),
    DANCING(9, "Dança"),
    CRAFTING(10, "Artesanato"),
    WRITING(11, "Escrita"),
    PLAYING_VIDEO_GAMES(12, "Jogos Eletrônicos"),
    COLLECTING(13, "Colecionismo"),
    YOGA(14, "Yoga"),
    KNITTING(15, "Tricô"),
    RUNNING(16, "Corrida"),
    SWIMMING(17, "Natação"),
    VOLUNTEERING(18, "Trabalho Voluntário"),
    BOARD_GAMES(19, "Jogos de Tabuleiro");

    private int id;
    private String nome;

    HobbiesEnum(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}
