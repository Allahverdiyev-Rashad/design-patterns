package structuralpatterns.adapter;

public class Test {
    public static void main(String[] args) {

        Socket socket = new Socket();
        Iron iron = new Iron();
        Refrigerator refrigerator = new Refrigerator();

        socket.power(iron);
        socket.power(refrigerator);

        SamsungMP samsungMP = new SamsungMP();
        MobilePhoneElectricalHomeApplianceAdapter adapter = new MobilePhoneElectricalHomeApplianceAdapter(samsungMP);

        socket.power(adapter);

    }

}
