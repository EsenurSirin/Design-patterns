package proxy;

import java.math.BigDecimal;

public class Manager implements EmployeeSalary {

    @Override
    public BigDecimal getEmployeeSalary() {
        return BigDecimal.valueOf(10000);
    }
}
