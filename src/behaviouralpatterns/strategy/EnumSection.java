package behaviouralpatterns.strategy;

public enum EnumSection {
    VERBAL("Verbal"),
    NUMERAL("Numeral"),
    AVERAGE("Average"),
    ;
    private String section;

    EnumSection(String section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return section;
    }
}
