package by.grigoryev.git.service;

import by.grigoryev.git.model.Coin;
import reactor.core.publisher.Flux;

public interface CoinService {

    Flux<Coin> findAll();

}
