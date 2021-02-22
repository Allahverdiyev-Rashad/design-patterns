package behaviouralpatterns.strategy;

public class Student {
    private EnumSection section;
    private Strategy strategy;

    public Student(EnumSection section) {
        this.section = section;
        if (section == null) {
            throw new NullPointerException("Section can't be null");
        }

        switch (section) {
            case VERBAL:
                strategy = new VerbalStrategy();
                break;
            case AVERAGE:
                strategy = new AverageStrategy();
                break;
            case NUMERAL:
                strategy = new NumeralStrategy();
                break;
            default:
                break;
        }
    }

    public String getPriority() {
        System.out.println("For" + section + "Strategy: ");
        String rank = "First :\n" + strategy.getFirst() + "\nSecond :\n" + strategy.getSecond() + "\nThird :\n" +strategy.getThird() +
                "\nFourth :\n"+ strategy.getFourth();
        return rank;
    }
}
