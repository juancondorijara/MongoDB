package pe.edu.vallegrande.backend.service.impl;

import pe.edu.vallegrande.backend.model.Customer;
import pe.edu.vallegrande.backend.repository.CustomerRepository;
import pe.edu.vallegrande.backend.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import java.util.List;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    Customer customer = new Customer();

    CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll() {
        log.info("List Customer");
        return customerRepository.findAll();
    }

    @Override
    public Customer save(Customer customer) {
        log.info("Save Customer: " + customer.toString());
        customer.setState("A");
        return customerRepository.save(customer);
    }

    @Override
    public Customer update(Customer customer) {
        log.info("Update Customer: " + customer.toString());
        customer.setState("A");
        return customerRepository.save(customer);
    }

    @Override
    public Customer delete(String id) {
        log.info("Delete Customer: " + id);
        customer.setState("I");
        return customerRepository.save(customer);
    }

    @Override
    public Customer restore(String id) {
        log.info("Restore Customer: " + id);
        customer.setState("A");
        return customerRepository.save(customer);
    }

}
