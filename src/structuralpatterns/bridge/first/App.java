package structuralpatterns.bridge.first;

public class App {

    public static void main(String[] args) {
        Music music = new Music("Eminem - Venom", "Venom,venom,venom");
        var computer = new Computer();
        computer.playMusic(music);
    }

}
