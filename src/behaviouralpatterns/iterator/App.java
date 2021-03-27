package behaviouralpatterns.iterator;

import java.util.List;

public class App {

    public static void main(String[] args) {
        Book book = new Book("Math");

        List<Question> questionList = book.getQuestionList();

        print(questionList);

        Book2 english = new Book2("English");
        Question[] questions = english.getQuestions();

        print(questions);
    }

    private static void print(Question[] questions) {
        for (Question question:
                questions) {
            Long questionNo = question.getQuestionNo();
            System.out.println("Question No: " + questionNo);
        }
    }

    private static void print(List<Question> questionList) {
        for (Question question:
                questionList) {
            Long questionNo = question.getQuestionNo();
            System.out.println("Question No: " + questionNo);
        }
    }
}
