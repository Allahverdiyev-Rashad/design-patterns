package creationalpatterns.builder;

public class House {
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

    public House() {
    }

    public House(String city, String district, int year, int numberOfBalcony, int numberOfRoom, int numberOfToilet,
                 boolean isDublex, boolean isFurnished, boolean hasParking, boolean hasPlaypen, boolean hasAirConditioning,
                 boolean hasPool) {
        this.city = city;
        this.district = district;
        this.year = year;
        this.numberOfBalcony = numberOfBalcony;
        this.numberOfRoom = numberOfRoom;
        this.numberOfToilet = numberOfToilet;
        this.isDublex = isDublex;
        this.isFurnished = isFurnished;
        this.hasParking = hasParking;
        this.hasPlaypen = hasPlaypen;
        this.hasAirConditioning = hasAirConditioning;
        this.hasPool = hasPool;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumberOfBalcony() {
        return numberOfBalcony;
    }

    public void setNumberOfBalcony(int numberOfBalcony) {
        this.numberOfBalcony = numberOfBalcony;
    }

    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public int getNumberOfToilet() {
        return numberOfToilet;
    }

    public void setNumberOfToilet(int numberOfToilet) {
        this.numberOfToilet = numberOfToilet;
    }

    public boolean isDublex() {
        return isDublex;
    }

    public void setDublex(boolean dublex) {
        isDublex = dublex;
    }

    public boolean isFurnished() {
        return isFurnished;
    }

    public void setFurnished(boolean furnished) {
        isFurnished = furnished;
    }

    public boolean isHasParking() {
        return hasParking;
    }

    public void setHasParking(boolean hasParking) {
        this.hasParking = hasParking;
    }

    public boolean isHasPlaypen() {
        return hasPlaypen;
    }

    public void setHasPlaypen(boolean hasPlaypen) {
        this.hasPlaypen = hasPlaypen;
    }

    public boolean isHasAirConditioning() {
        return hasAirConditioning;
    }

    public void setHasAirConditioning(boolean hasAirConditioning) {
        this.hasAirConditioning = hasAirConditioning;
    }

    public boolean isHasPool() {
        return hasPool;
    }

    public void setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
    }

    @Override
    public String toString() {
        return "House{" +
                "city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", year=" + year +
                ", numberOfBalcony=" + numberOfBalcony +
                ", numberOfRoom=" + numberOfRoom +
                ", numberOfToilet=" + numberOfToilet +
                ", isDublex=" + isDublex +
                ", isFurnished=" + isFurnished +
                ", hasParking=" + hasParking +
                ", hasPlaypen=" + hasPlaypen +
                ", hasAirConditioning=" + hasAirConditioning +
                ", hasPool=" + hasPool +
                '}';
    }
}
