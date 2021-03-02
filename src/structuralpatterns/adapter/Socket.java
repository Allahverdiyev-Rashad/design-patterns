package structuralpatterns.adapter;

public class Socket {
    public void power(ElectricalHomeAppliance electricalHomeAppliance) {
        int voltage = electricalHomeAppliance.run();
        System.out.println(voltage + " voltage");
    }
}
