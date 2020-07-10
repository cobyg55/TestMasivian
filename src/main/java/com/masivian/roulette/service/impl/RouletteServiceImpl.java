package com.masivian.roulette.service.impl;

import com.masivian.roulette.model.Roulette;
import com.masivian.roulette.repository.RouletteRepository;
import com.masivian.roulette.service.RouletteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RouletteServiceImpl implements RouletteService {

    @Autowired
    private RouletteRepository rouletteRepository;

    @Override
    public List<Roulette> findAll() {
        return (List<Roulette>) rouletteRepository.findAll();
    }

    @Override
    public Optional<Roulette> findById(Long id) {
        return rouletteRepository.findById(id);
    }

    @Override
    public Roulette create(Roulette roulette) {
        return rouletteRepository.save(roulette);
    }

    @Override
    public Roulette update(Roulette roulette) {
        return rouletteRepository.save(roulette);
    }


}
