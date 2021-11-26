package structuralpatterns.proxy;

import java.math.BigDecimal;

public class ManagerProxy implements CompanyInfo {
    private RealManager realManager;
    private String name;
    private String password;

    public ManagerProxy(String name, String password) {
        this.realManager = new RealManager();
        this.name = name;
        this.password = password;
    }

    private boolean isUserManager() {
        boolean isUserManager = false;

        boolean isUserValid = WorkerUtil.isUserValid(name, password);
        if (isUserValid) {
            Worker worker = WorkerUtil.getWorkerByUserName(name);
            isUserManager = worker.isManager();
        }

        return isUserManager;
    }

    @Override
    public BigDecimal getTurnover() throws IllegalArgumentException{
        boolean userManager = isUserManager();

        if (userManager) {
            return realManager.getTurnover();
        } else {
            throw new IllegalArgumentException();
        }
    }
}
