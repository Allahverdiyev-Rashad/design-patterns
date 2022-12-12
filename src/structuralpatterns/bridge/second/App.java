package structuralpatterns.bridge.second;


public class App {

    public static void main(String[] args) {
      Music music = new Music("Eminem - Venom", "Venom,venom,venom");
        var computer = new HeadphoneAndFizy();
        computer.playMusic(music);
    }

}
