package structuralpatterns.proxy;

public class Worker {
    private String name;
    private String password;
    private boolean isManager;

    public Worker(String name, String password, boolean isUser) {
        this.name = name;
        this.password = password;
        this.isManager = isUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }
}
