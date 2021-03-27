package behaviouralpatterns.iterator;

public class Question {
    private Long questionNo;

    public Question(Long questionNo) {
        this.questionNo = questionNo;
    }

    public Long getQuestionNo() {
        return questionNo;
    }

    public void setQuestionNo(Long questionNo) {
        this.questionNo = questionNo;
    }
}
