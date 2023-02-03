package by.grigoryev.git.controller;

import by.grigoryev.git.model.Coin;
import by.grigoryev.git.service.CoinService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequiredArgsConstructor
@RequestMapping("/coins")
public class CoinController {

    private final CoinService coinService;

    @GetMapping
    Flux<Coin> findAll() {
        return coinService.findAll();
    }

}
