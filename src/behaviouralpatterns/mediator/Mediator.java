package behaviouralpatterns.mediator;

public interface Mediator {

    void addProducer(Producer producer);
    void addClient(Client client);

    void getFromProducer(Producer producer);
    void sellToClient(Client client);
}
