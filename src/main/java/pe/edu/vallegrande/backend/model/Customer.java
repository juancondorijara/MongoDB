package pe.edu.vallegrande.backend.model;

//import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//@Data
@Document(collection = "customer")
public class Customer {

    @Id
    private String id;

    private String dni;

    private String firstName;

    private String lastName;

    private String state;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.id = dni;
    }

    public String getFirsName() {
        return firstName;
    }

    public void setFirsName(String firstName) {
        this.id = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.id = lastName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.id = state;
    }
    
}
