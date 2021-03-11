package behaviouralpatterns.chainofresponsibility;

public class App {

    public static void main(String[] args) {

        CargoCompany sbmCargo = SbmCargo.getCargoCompany();
        sbmCargo.send(EnumCity.GANJA);

        System.out.println("\n-------------\n");
        sbmCargo.send(EnumCity.BARDA);

        System.out.println("\n-------------\n");
        sbmCargo.send(EnumCity.BAKU);

        System.out.println("\n-------------\n");
        sbmCargo.send(EnumCity.YEVLAKH);

        System.out.println("\n-------------\n");
        sbmCargo.send(EnumCity.SUMQAYIT);
    }
}
