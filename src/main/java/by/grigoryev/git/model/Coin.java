package by.grigoryev.git.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
@Document(collection = "coins")
public class Coin {

    @Id
    private String id;

    private String symbol;

    @JsonProperty("price_usd")
    private BigDecimal price;
}
