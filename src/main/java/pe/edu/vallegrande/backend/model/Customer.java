package pe.edu.vallegrande.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@Data
@Document(collection = "customer")
public class Customer {

    @Id
    private String id;

    private String dni;

    private String firstName;

    private String lastName;

    private String state;
    
}
