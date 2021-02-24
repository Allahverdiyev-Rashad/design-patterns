package behaviouralpatterns.memento;

import java.util.ArrayList;
import java.util.List;

public class Memento {
    private List<NotepadMemento> list;

    public Memento() {
        list = new ArrayList<>();
    }

    public void add(NotepadMemento memento) {
        list.add(memento);
    }

    public NotepadMemento returnLastVersion() {
        if (!list.isEmpty()) {
            NotepadMemento lastVersion = list.get(list.size() - 1);
            list.remove(lastVersion);
            return lastVersion;
        } else {
            throw new ArrayIndexOutOfBoundsException("Last version not found");
        }
    }
}
