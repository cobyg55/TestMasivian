package com.masivian.roulette.repository;

import com.masivian.roulette.model.Roulette;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RouletteRepository extends CrudRepository<Roulette, Long> {
}
