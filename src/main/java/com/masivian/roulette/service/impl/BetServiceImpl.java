package com.masivian.roulette.service.impl;

import com.masivian.roulette.model.Bet;
import com.masivian.roulette.repository.BetRepository;
import com.masivian.roulette.service.BetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BetServiceImpl implements BetService {

    @Autowired
    private BetRepository betRepository;

    @Override
    public Bet create(Bet bet) {
        return betRepository.save(bet);
    }
}
