package structuralpatterns.bridge.first;

public class Computer {

    private Spotify spotify;
    private Speaker speaker;

    public Computer() {
        spotify = new Spotify();
        speaker = new Speaker();
    }

    public void playMusic(Music music) {
        String voice = spotify.playMusic(music);
        speaker.play(voice);
    }

    public Spotify getSpotify() {
        return spotify;
    }

    public void setSpotify(Spotify spotify) {
        this.spotify = spotify;
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

}
