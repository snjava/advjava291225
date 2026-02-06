package edu.learning;

import edu.learning.controller.StudentController;
import edu.learning.model.Employee;
import edu.learning.model.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
public class SbCoreApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SbCoreApplication.class, args);

        StudentController controller = context.getBean( StudentController.class);
        controller.saveStudentDetails();

        /*Product p1 = context.getBean( Product.class);
        Product p2 = context.getBean( Product.class);
        Product p3 = context.getBean( Product.class);
        Product p4 = context.getBean( Product.class);
        Product p5 = context.getBean( Product.class);*/

        //Employee emp = context.getBean("getEmp1", Employee.class);
        //System.out.println("Employee Department : " + emp.getDepartment());
	}

    @Primary
    @Bean
    public Employee getEmp1() {
        Employee employee = new Employee("HR");
        return employee;
    }

    @Bean
    public Employee getEmp2() {
        Employee employee = new Employee();
        employee.setDepartment("Developer");
        return employee;
    }

}
