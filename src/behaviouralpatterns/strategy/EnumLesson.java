package behaviouralpatterns.strategy;

public enum EnumLesson {
    LANGUAGE("Language"),
    MATH("Mathematic"),
    SCİENCE("Science"),
    SOCIAL("Social"),
    ;

private String lesson;
    EnumLesson(String lesson) {
        this.lesson = lesson;
    }

    @Override
    public String toString() {
        return lesson;
    }
}
