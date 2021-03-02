package structuralpatterns.adapter;

public class Iron implements ElectricalHomeAppliance {
    private int voltage;

    public Iron() {
        this.voltage = 220;
    }

    @Override
    public int run() {
        System.out.println("-----Iron-----");
        return voltage;
    }
}
