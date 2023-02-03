package by.grigoryev.git.service.impl;

import by.grigoryev.git.model.Coin;
import by.grigoryev.git.model.Ticker;
import by.grigoryev.git.repository.CoinRepository;
import by.grigoryev.git.service.CoinService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class CoinServiceImpl implements CoinService {

    private final CoinRepository coinRepository;

    @Override
    public Flux<Coin> findAll() {
        WebClient webClient = WebClient.create();
        return webClient.get()
                .uri("https://api.coinlore.net/api/tickers/")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToFlux(Ticker.class)
                .flatMap(ticker -> coinRepository.saveAll(ticker.getData()))
                .log("findAll");
    }
}
