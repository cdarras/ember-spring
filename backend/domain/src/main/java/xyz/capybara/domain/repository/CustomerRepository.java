package xyz.capybara.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.capybara.domain.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
