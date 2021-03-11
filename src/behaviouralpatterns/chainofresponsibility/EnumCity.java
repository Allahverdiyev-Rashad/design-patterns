package behaviouralpatterns.chainofresponsibility;

public enum EnumCity {
    BAKU("Baku"),
    SUMQAYIT("Sumqayit"),
    GANJA("Ganja"),
    BARDA("Barda"),
    YEVLAKH("Yevlakh");

    private String city;

    EnumCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return city;
    }
}
