package creationalpatterns.builder;

// With Builder
public class RieltorV2 {
    public static void main(String[] args) {
        House house1 = HouseBuilder.startBuild("Baku", "Xezer", 2008, 4)
                .setHasAirConditioning(true)
                .setFurnished(true)
                .build();

        printHouse(house1);
    }

    private static void printHouse(House house) {
        System.out.println();
        System.out.println("House added -- " + house);
    }
}
