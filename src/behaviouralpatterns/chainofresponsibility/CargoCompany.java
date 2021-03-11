package behaviouralpatterns.chainofresponsibility;

public abstract class CargoCompany {

    private EnumCity enumCity;
    private CargoCompany nextCargoCompany;

    public CargoCompany(EnumCity enumCity) {
        this.enumCity = enumCity;
    }

    public EnumCity getEnumCity() {
        return enumCity;
    }

    public void setEnumCity(EnumCity enumCity) {
        this.enumCity = enumCity;
    }

    public CargoCompany getNextCargoCompany() {
        return nextCargoCompany;
    }

    public void setNextCargoCompany(CargoCompany nextCargoCompany) {
        this.nextCargoCompany = nextCargoCompany;
    }

    public void send(EnumCity city) {
        printIncomingCargoInformation(city);

        if (getEnumCity().equals(city)) {
            printCargoDeliveryInformation();
        } else if (getNextCargoCompany() != null) {
            getNextCargoCompany().send(city);
        } else {
            printOutOfServiceArea(city);
        }
    }


    private void printOutOfServiceArea(EnumCity city) {
        System.out.println(city.getCity()
                + " out of service area");
    }

    private void printCargoDeliveryInformation() {
        System.out.println(getEnumCity().getCity()
                + " the branch took delivery");
    }

    private void printIncomingCargoInformation(EnumCity city) {
        System.out.println("Cargo to "
                + city.getCity() + "-> came to the"
                + getEnumCity().getCity() + " branch");
    }
}
