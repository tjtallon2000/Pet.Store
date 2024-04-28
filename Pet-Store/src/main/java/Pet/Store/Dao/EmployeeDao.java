package Pet.Store.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import Pet.Store.Entity.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Long> {

}