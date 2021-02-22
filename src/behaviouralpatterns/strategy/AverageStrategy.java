package behaviouralpatterns.strategy;

public class AverageStrategy implements Strategy {
    @Override
    public EnumLesson getFirst() {

        return EnumLesson.LANGUAGE;
    }

    @Override
    public EnumLesson getSecond() {

        return EnumLesson.MATH;
    }

    @Override
    public EnumLesson getThird() {

        return EnumLesson.SOCIAL;
    }

    @Override
    public EnumLesson getFourth() {

        return EnumLesson.SCİENCE;
    }
}
