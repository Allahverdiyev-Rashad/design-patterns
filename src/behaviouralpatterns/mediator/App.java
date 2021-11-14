package behaviouralpatterns.mediator;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        MediatorImpl mediator = new MediatorImpl();

        TomatoProducer producerJames = new TomatoProducer("James", BigDecimal.valueOf(4), mediator);
        TomatoProducer producerJack = new TomatoProducer("Jack", BigDecimal.valueOf(3), mediator);

        TomatoClient clientDavid = new TomatoClient("David", BigDecimal.valueOf(5), mediator);
        TomatoClient clientBill = new TomatoClient("Bill", BigDecimal.valueOf(7), mediator);

        mediator.addProducer(producerJames);
        mediator.addProducer(producerJack);

        mediator.addClient(clientDavid);
        mediator.addClient(clientBill);

        producerJames.sellProduct();
        clientBill.buyProduct();
    }
}
