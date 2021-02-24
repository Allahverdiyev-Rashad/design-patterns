package behaviouralpatterns.memento;

public class NotepadMemento {
    private String text;

    public NotepadMemento() {
        text = "";
    }

    public NotepadMemento(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
