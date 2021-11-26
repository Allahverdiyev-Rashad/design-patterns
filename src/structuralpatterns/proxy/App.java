package structuralpatterns.proxy;

import java.math.BigDecimal;

public class App {

    public static void main(String[] args) {
        ManagerProxy managerProxy = new ManagerProxy("Veronica", "12345");
//        ManagerProxy managerProxy = new ManagerProxy("James", "123");
//        In this case throws IllegalArgumentException

        try {
            BigDecimal turnover = managerProxy.getTurnover();
            System.out.println("Company endorsement : " + turnover);
        } catch (IllegalArgumentException e) {
            System.out.println("Permission denied");
        }


    }
}
