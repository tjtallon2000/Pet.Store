package Pet.Store.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import Pet.Store.Entity.Customer;

public interface CustomerDao extends JpaRepository<Customer, Long> {

}



