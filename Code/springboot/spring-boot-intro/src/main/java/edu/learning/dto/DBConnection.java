package edu.learning.dto;

public class DBConnection {
    private String dbUserName;
    private String dbPassword;
    public DBConnection(String dbUserName, String dbPassword) {
        this.dbUserName = dbUserName;
        this.dbPassword = dbPassword;
        System.out.println("DBConnection Object Created");
    }

    public void printDetails() {
        System.out.println("User Name : " + dbUserName);
        System.out.println("Password : " + dbPassword);
    }
}
