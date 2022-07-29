package proxy;

import java.math.BigDecimal;

public class ManagerProxy implements EmployeeSalary {

    private Manager manager;

    private String userName;

    private String password;

    public ManagerProxy(String userName, String password) {
        this.manager = new Manager();
        this.userName = userName;
        this.password = password;
    }

    private boolean managerUser() {

        boolean managerUser = false;

        boolean userValid = EmployeeUtil.userValid(userName, password);

        if (userValid) {
            Employee employee = EmployeeUtil.getEmployeeByUserName(userName);
            managerUser = employee.isManager();
        }
        return managerUser;
    }

    @Override
    public BigDecimal getEmployeeSalary() throws IllegalAccessException {

        boolean managerUser = managerUser();

        if (managerUser) {
            return manager.getEmployeeSalary();
        } else {
            throw new IllegalAccessException();
        }
    }
}
