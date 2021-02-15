package creationalpatterns.builder;

// Without Builder
public class Rieltor {
    public static void main(String[] args) {
        House house1 = new House();
        house1.setCity("Baku");
        house1.setDistrict("Xetayi");
        house1.setNumberOfRoom(3);
        house1.setHasAirConditioning(true);
        house1.setYear(2010);

        House house2 = new House("Baku", "Nizami", 2010,
                5, 4,
                2, true, true, false,
                false, true, false);

        printHouse(house1);
        printHouse(house2);

    }

    private static void printHouse(House house) {
        System.out.println();
        System.out.println("House added -- " + house);
    }
}
