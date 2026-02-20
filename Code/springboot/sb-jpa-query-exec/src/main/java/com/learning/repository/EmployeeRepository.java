package com.learning.repository;

import com.learning.EmployeeCount;
import com.learning.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

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

    // UPDATE emp_details SET skills=? WHERE emp_name=?
    @Transactional
    @Modifying
    @Query(value = "UPDATE emp_details SET skills= :sk WHERE emp_name= :nm", nativeQuery = true) // SQL
    public void updateSkills(@Param("nm")  String name, @Param("sk") String skills);

    // SQL: UPDATE emp_details SET emp_city= ? WHERE emp_name= ?
    // HQL: UPDATE Employee SET city= ? WHERE name= ?

    @Transactional
    @Modifying
    @Query(value = "UPDATE Employee SET city= :ct WHERE name= :n", nativeQuery = false) // HQL
    public void updateCity(@Param("n") String name, @Param("ct") String city);

    @Query(value = "SELECT emp_city, count(id) as empcount FROM emp_details GROUP BY emp_city", nativeQuery = true)
    public List<EmployeeCount> getEmpCountByCity();

    @Transactional
    @Modifying
    @Query(value = "DELETE FROM Employee WHERE city= :ct")
    public void deleteByCity(@Param("ct") String city);
}










