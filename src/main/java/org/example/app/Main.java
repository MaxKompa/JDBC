package org.example.app;

public class Main {
    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAO();


        employeeDAO.addEmployee("John Doe", 30, "Developer", 60000f);


        employeeDAO.getEmployee(1);


        employeeDAO.updateEmployee(1, "John Doe", 31, "Senior Developer", 70000f);


        employeeDAO.deleteEmployee(1);
    }
}

