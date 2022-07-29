package proxy;

public class Employee {

    private String userName;
    private String password;
    private boolean manager;

    public Employee(String userName, String password, boolean manager) {
        this.userName = userName;
        this.password = password;
        this.manager = manager;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isManager() {
        return manager;
    }

    public void setManager(boolean manager) {
        this.manager = manager;
    }
}
