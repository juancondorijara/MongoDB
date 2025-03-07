package pe.edu.vallegrande.backend.rest;

import pe.edu.vallegrande.backend.model.Customer;
import pe.edu.vallegrande.backend.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1/api/customer")
public class CustomerRest {

    @Autowired
    CustomerService customerService;

    @Autowired
    public CustomerRest(CustomerService customerService) {
        this.customerService = customerService;
    }
    
    @GetMapping
    public List <Customer> findAll(){
        return customerService.findAll();
    }

    @PostMapping("/save")
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @PutMapping("/update/{id}")
    public Customer update(@PathVariable String id, @RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @PatchMapping("/delete/{id}")
    public Customer delete(@PathVariable String id) {
        return customerService.delete(id);
    }

    @PatchMapping("/restore/{id}")
    public Customer restore(@PathVariable String id) {
        return customerService.restore(id);
    }

}
