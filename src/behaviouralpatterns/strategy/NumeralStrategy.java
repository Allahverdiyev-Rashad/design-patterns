package behaviouralpatterns.strategy;

public class NumeralStrategy implements Strategy {
    @Override
    public EnumLesson getFirst() {

        return EnumLesson.MATH;
    }

    @Override
    public EnumLesson getSecond() {

        return EnumLesson.SCİENCE;
    }

    @Override
    public EnumLesson getThird() {

        return EnumLesson.SOCIAL;
    }

    @Override
    public EnumLesson getFourth() {

        return EnumLesson.LANGUAGE;
    }
}
