package com.masivian.roulette.repository;

import com.masivian.roulette.model.Bet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BetRepository extends CrudRepository<Bet, String> {
}
