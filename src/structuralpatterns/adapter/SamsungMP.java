package structuralpatterns.adapter;

public class SamsungMP implements MobilePhone {
    private int voltage;

    public SamsungMP() {
        this.voltage = 5;
    }

    @Override
    public int charge() {
        System.out.println("----SamsungMP----");
        return voltage;
    }
}
