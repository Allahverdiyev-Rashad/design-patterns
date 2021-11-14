package behaviouralpatterns.mediator;

import java.math.BigDecimal;

public class TomatoProducer extends Producer {

    public TomatoProducer(String name, BigDecimal price, Mediator mediator) {
        super(name, EnumProduct.TOMATO, price, mediator);
    }
}
