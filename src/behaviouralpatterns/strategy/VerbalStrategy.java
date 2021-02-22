package behaviouralpatterns.strategy;

public class VerbalStrategy implements Strategy {
    @Override
    public EnumLesson getFirst() {

        return EnumLesson.LANGUAGE;
    }

    @Override
    public EnumLesson getSecond() {

        return EnumLesson.SOCIAL;
    }

    @Override
    public EnumLesson getThird() {

        return EnumLesson.MATH;
    }

    @Override
    public EnumLesson getFourth() {

        return EnumLesson.SCİENCE;
    }
}
