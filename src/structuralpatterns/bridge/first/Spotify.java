package structuralpatterns.bridge.first;

public class Spotify {

    public String playMusic(Music music) {
        System.out.println("Spotify " + music + " playing...");
        return music.getVoice();
    }

}
