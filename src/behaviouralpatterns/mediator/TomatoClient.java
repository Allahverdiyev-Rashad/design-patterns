package behaviouralpatterns.mediator;

import java.math.BigDecimal;

public class TomatoClient extends Client {
    public TomatoClient(String name, BigDecimal price, Mediator mediator) {
        super(name, EnumProduct.TOMATO, price, mediator);
    }
}
