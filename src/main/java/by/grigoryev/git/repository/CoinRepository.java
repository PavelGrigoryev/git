package by.grigoryev.git.repository;


import by.grigoryev.git.model.Coin;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoinRepository extends ReactiveMongoRepository<Coin, String> {
}
