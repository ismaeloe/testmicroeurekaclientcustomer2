package mx.com.ismaeloe.customer.repository;

import mx.com.ismaeloe.customer.repository.entity.Customer;

import mx.com.ismaeloe.customer.repository.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository  extends JpaRepository<Customer,Long> {
	
        public Customer findByNumberID(String numberID);
        public List<Customer> findByLastName(String lastName);
        public List<Customer> findByRegion(Region region);
}
