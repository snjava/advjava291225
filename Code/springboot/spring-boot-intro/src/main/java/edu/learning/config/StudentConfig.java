package edu.learning.config;

import edu.learning.dto.DBConnection;
import edu.learning.dto.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    public Student createStudent() {
        Student st = new Student("Abc College..");
        return st;
    }

    @Bean("mysqlDBConn")
    public DBConnection createConnectionObject() {
        DBConnection dbConnection = new DBConnection("root", "root123");
        return dbConnection;
    }

    @Bean("oracleDBConn")
    public DBConnection createConnectionObject1() {
        DBConnection dbConnection = new DBConnection("system", "system123");
        return dbConnection;
    }


}
