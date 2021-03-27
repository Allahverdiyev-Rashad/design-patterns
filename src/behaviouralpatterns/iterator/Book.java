package behaviouralpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private String name;
    private List<Question> questionList;

    public Book(String name) {
        this.name = name;
        this.questionList = new ArrayList<>();

        questionList.add(new Question(1L));
        questionList.add(new Question(2L));
        questionList.add(new Question(3L));
        questionList.add(new Question(4L));
        questionList.add(new Question(5L));
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }
}
