package structuralpatterns.adapter;

public class Refrigerator implements ElectricalHomeAppliance {
    private int voltage;

    public Refrigerator() {
        this.voltage = 220;
    }

    @Override
    public int run() {
        System.out.println("-----Refrigerator-----");
        return voltage;
    }

}
