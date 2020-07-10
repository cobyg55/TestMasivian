package com.masivian.roulette.dto;

import lombok.Data;

@Data
public class BetDto {

    private Long idRoulette;
    private Long idBet;
    private Long betsMoney;
    private String idUser;
    private String color;
    private Long number;
}
