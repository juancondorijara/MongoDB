package pe.edu.vallegrande.backend.service;

import pe.edu.vallegrande.backend.model.Customer;
import java.util.List;

public interface CustomerService {

    List<Customer> findAll();

    Customer save(Customer customer);

    Customer update(Customer customer);

    Customer delete(String id);

    Customer restore(String id);
    
}
