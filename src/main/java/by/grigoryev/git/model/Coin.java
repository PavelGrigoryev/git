package by.grigoryev.git.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "coins")
public class Coin {

    @Id
    private String id;

}
