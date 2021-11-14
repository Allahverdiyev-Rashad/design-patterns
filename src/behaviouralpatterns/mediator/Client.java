package behaviouralpatterns.mediator;

import java.math.BigDecimal;

public abstract class Client {
    private String name;
    private EnumProduct product;
    private BigDecimal price;
    private Mediator mediator;

    public Client() {
    }

    public Client(String name, EnumProduct product, BigDecimal price, Mediator mediator) {
        this.name = name;
        this.product = product;
        this.price = price;
        this.mediator = mediator;
    }

    public void buyProduct() {
        mediator.sellToClient(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnumProduct getProduct() {
        return product;
    }

    public void setProduct(EnumProduct product) {
        this.product = product;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
