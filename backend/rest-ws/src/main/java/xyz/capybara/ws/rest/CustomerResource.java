package xyz.capybara.ws.rest;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import xyz.capybara.domain.entity.Customer;
import xyz.capybara.domain.repository.CustomerRepository;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor
public class CustomerResource {

    @NonNull
    private final CustomerRepository customerRepository;

    @GetMapping
    public Collection<Customer> findAll() {
        return customerRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Customer find(@PathVariable("id") Customer customer) {
        return customer;
    }

    @PostMapping
    public Customer create(@RequestBody Customer customer) {
        return customerRepository.save(customer);
    }
}
