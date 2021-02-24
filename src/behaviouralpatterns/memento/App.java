package behaviouralpatterns.memento;

public class App {
    public static void main(String[] args) {
        Memento memento = new Memento();
        Notepad notepad = new Notepad();

        notepad.add("R");
        notepad.add("A");
        notepad.add("S");
        notepad.add("H");

        saveVersion(memento, notepad);

        notepad.add("AD");
        saveVersion(memento, notepad);
        // wrong info adding
        notepad.add(".");

        notepad.printText();
        // back to last version
        notepad.backToLast(memento.returnLastVersion());
        saveVersion(memento, notepad);

        notepad.add(" ALLAHVERDIYEV");

        saveVersion(memento, notepad);
        // wrong info adding
        notepad.add(".");
        notepad.printText();
        // back to last version
        notepad.backToLast(memento.returnLastVersion());
        notepad.printText();

        notepad.backToLast(memento.returnLastVersion());
        notepad.printText();

        notepad.backToLast(memento.returnLastVersion());
        notepad.printText();

    }

    private static void saveVersion(Memento memento, Notepad notepad) {
        NotepadMemento text = notepad.save();
        memento.add(text);
        notepad.printText();
    }
}
