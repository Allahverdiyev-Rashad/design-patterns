package behaviouralpatterns.mediator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MediatorImpl implements Mediator {
    private List<Producer> producers = new ArrayList<>();
    private List<Client> clients = new ArrayList<>();

    public MediatorImpl(List<Producer> producers, List<Client> clients) {
        this.producers = producers;
        this.clients = clients;
    }

    public MediatorImpl() {

    }

    @Override
    public void addProducer(Producer producer) {
        producers.add(producer);
    }

    @Override
    public void addClient(Client client) {
        clients.add(client);
    }

    @Override
    public void getFromProducer(Producer producer) {
        Client client = findTheBestClient(producer.getProduct());
        sell(producer, client);
    }

    @Override
    public void sellToClient(Client client) {
        Producer producer = findTheBestProducer(client.getProduct());
        sell(producer, client);
    }

    private void sell(Producer producer, Client client) {
        System.out.println(producer.getName() + " Producer "
                + client.getName() + " Client");
    }

    private Client findTheBestClient(EnumProduct product) {
        Client theBestClient = null;

        for (Client client : clients) {
            if (product.equals(client.getProduct())) {
                BigDecimal producerPrice = client.getPrice();

                if (theBestClient == null ||
                        theBestClient.getPrice().compareTo(producerPrice) < 0) {
                    theBestClient = client;
                }
            }
        }
        return theBestClient;
    }

    private Producer findTheBestProducer(EnumProduct product) {
        Producer theBestProducer = null;

        for (Producer producer : producers) {
            if (product.equals(producer.getProduct())) {
                BigDecimal producerPrice = producer.getPrice();

                if (theBestProducer == null ||
                        theBestProducer.getPrice().compareTo(producerPrice) > 0) {
                    theBestProducer = producer;
                }
            }
        }
        return theBestProducer;
    }
}
