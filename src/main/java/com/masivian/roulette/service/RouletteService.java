package com.masivian.roulette.service;

import com.masivian.roulette.model.Roulette;

import java.util.List;
import java.util.Optional;

public interface RouletteService {
    List<Roulette> findAll();
    Optional<Roulette> findById(Long id);
    Roulette create(Roulette roulette);
    Roulette update(Roulette roulette);
    Roulette open(Roulette roulette);
    Roulette close(Roulette roulette);
}