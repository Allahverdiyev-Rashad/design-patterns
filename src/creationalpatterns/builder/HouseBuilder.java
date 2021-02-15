package creationalpatterns.builder;

public class HouseBuilder {
    private String city;
    private String district;

    private int year;
    private int numberOfBalcony;
    private int numberOfRoom;
    private int numberOfToilet;

    private boolean isDublex;
    private boolean isFurnished;
    private boolean hasParking;
    private boolean hasPlaypen;
    private boolean hasAirConditioning;
    private boolean hasPool;

    // You can create with forced parametres if you want like below
    // You can create many build methods with another parametres like start3RoomBuild,startBakuHouseBuild etc.
    public static HouseBuilder startBuild(String city, String district, int year, int numberOfRoom) {
        HouseBuilder houseBuilder = new HouseBuilder();

        houseBuilder.city = city;
        houseBuilder.district = district;
        houseBuilder.year = year;
        houseBuilder.numberOfRoom = numberOfRoom;

        return houseBuilder;
    }

    public House build() {
        House house = new House();

        house.setCity(city);
        house.setDistrict(district);

        house.setYear(year);
        house.setNumberOfBalcony(numberOfBalcony);
        house.setNumberOfRoom(numberOfRoom);
        house.setNumberOfToilet(numberOfToilet);

        house.setDublex(isDublex);
        house.setFurnished(isFurnished);
        house.setHasParking(hasParking);
        house.setHasPlaypen(hasPlaypen);
        house.setHasAirConditioning(hasAirConditioning);
        house.setHasPool(hasPool);

        return house;
    }


    public HouseBuilder setNumberOfBalcony(int numberOfBalcony) {
        this.numberOfBalcony = numberOfBalcony;
        return this;
    }

    public HouseBuilder setNumberOfToilet(int numberOfToilet) {
        this.numberOfToilet = numberOfToilet;
        return this;
    }

    public HouseBuilder setDublex(boolean dublex) {
        isDublex = dublex;
        return this;
    }

    public HouseBuilder setFurnished(boolean furnished) {
        isFurnished = furnished;
        return this;
    }

    public HouseBuilder setHasParking(boolean hasParking) {
        this.hasParking = hasParking;
        return this;
    }

    public HouseBuilder setHasPlaypen(boolean hasPlaypen) {
        this.hasPlaypen = hasPlaypen;
        return this;
    }

    public HouseBuilder setHasAirConditioning(boolean hasAirConditioning) {
        this.hasAirConditioning = hasAirConditioning;
        return this;
    }

    public HouseBuilder setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
        return this;
    }
}
