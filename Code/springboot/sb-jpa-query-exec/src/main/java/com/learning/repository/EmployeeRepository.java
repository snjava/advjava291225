package com.learning.repository;

import com.learning.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    //select * from emp_details WHERE emp_name = ?;
    // Get Employee By Name
    public List<Employee> findByName(String a);

    // get Employees by City
    public List<Employee> findByCity(String c);

    //select * from emp_details WHERE skills like '%Angular%';
    public List<Employee> findBySkillsContaining(String skill);

    public List<Employee> findByCityAndSkillsContaining(String city, String skill);

    //select * from emp_details WHERE experience between 3 AND 10;
    public List<Employee> findByExperienceBetween(int min, int max);
}
