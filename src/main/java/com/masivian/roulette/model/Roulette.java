package com.masivian.roulette.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.ArrayList;
import java.util.List;


@RedisHash("Roulette")
@Data
public class Roulette {

    @Id
    private Long id;
    private boolean status;

    @JsonIgnore
    private List<Bet> bets = new ArrayList<>();;
}