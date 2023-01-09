package com.saveoperation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saveoperation.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{


}
