package behaviouralpatterns.iterator;

import java.util.Iterator;

public class QuestionIterator implements Iterator {

    private Question[] questions;
    private int queue;

    public QuestionIterator(Question[] questions) {
        this.questions = questions;
    }

    @Override
    public boolean hasNext() {
        if (queue < questions.length) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        Question question = questions[queue];
        queue++;
        return question;
    }
}
