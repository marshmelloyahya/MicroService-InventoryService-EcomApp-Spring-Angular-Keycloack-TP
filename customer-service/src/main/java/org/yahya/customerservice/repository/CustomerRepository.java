package org.yahya.customerservice.repository;

import org.yahya.customerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.nio.file.LinkOption;

/**
 * @author yahyaouali
 **/
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
