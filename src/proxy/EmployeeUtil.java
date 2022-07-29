package proxy;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class EmployeeUtil {

    public static List<Employee> getEmployeeList() {

        Employee bahadir = new Employee("bahadir1", "12345", false);
        Employee ayse = new Employee("ayshe", "12345678", false);
        Employee bahar = new Employee("bahar", "23456", true);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(bahadir);
        employeeList.add(ayse);
        employeeList.add(bahar);

        return employeeList;
    }

    public static Map<String, Employee> getUserNAmeEmployeeMap() {

        List<Employee> employeeList = getEmployeeList();

        Map<String, Employee> map = new LinkedHashMap<>();

        for (Employee employee : employeeList) {
            map.put(employee.getUserName(), employee);
        }

        return map;
    }

    public static Employee getEmployeeByUserName(String userName) {

        Map<String, Employee> map = getUserNAmeEmployeeMap();
        Employee employee = map.get(userName);

        return employee;
    }

    public static boolean userValid(String userName, String password) {

        boolean userValid = false;
        Employee employee = getEmployeeByUserName(userName);

        if (employee != null) {

            userValid = employee.getPassword().equals(password);
        }

        return userValid;
    }
}


