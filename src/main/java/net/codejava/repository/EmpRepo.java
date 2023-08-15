package net.codejava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.codejava.entity.Employee;

@Repository
public interface EmpRepo extends JpaRepository<Employee,Integer>{
	

}
