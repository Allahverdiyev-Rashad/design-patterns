package structuralpatterns.bridge.second;

public class Fizy implements Playable{

    @Override
    public String playMusic(Music music) {
        System.out.println("Fizy " + music + " playing...");
        return music.getVoice();
    }

}
