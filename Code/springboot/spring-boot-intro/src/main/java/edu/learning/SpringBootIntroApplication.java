package edu.learning;

import edu.learning.dto.DBConnection;
import edu.learning.dto.Student;
import edu.learning.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"edu.learning","com.bean"})
public class SpringBootIntroApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootIntroApplication.class, args);

        Employee employee = context.getBean(Employee.class);
        employee.printDetails();

        Student student = context.getBean(Student.class);
        student.printDetails();

        DBConnection dbConnection = context.getBean("mysqlDBConn", DBConnection.class);
        dbConnection.printDetails();
	}

}
