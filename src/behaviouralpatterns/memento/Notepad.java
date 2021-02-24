package behaviouralpatterns.memento;

public class Notepad {
    private String text;

    public Notepad() {
        text = "";
    }

    public Notepad(String text) {
        this.text = text;
    }

    public void add(String newText) {
        text = text + newText;
    }

    public NotepadMemento save() {
        return new NotepadMemento(text);
    }

    public void backToLast(NotepadMemento memento) {
        text = memento.getText();
    }

    public void printText() {
        System.out.println(text);
    }
}
