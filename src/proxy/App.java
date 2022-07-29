package proxy;

import java.math.BigDecimal;

public class App {

    public static void main(String[] args) {

        ManagerProxy managerProxy = new ManagerProxy("bahar", "23456");

        try {

            BigDecimal employeeSalary = managerProxy.getEmployeeSalary();
            System.out.println("Employee Salary: " + employeeSalary);

        } catch (IllegalAccessException e) {
            System.out.println("you do not have access to confidential information!");

        }
    }
}
