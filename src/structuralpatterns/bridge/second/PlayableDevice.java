package structuralpatterns.bridge.second;

public abstract class PlayableDevice {

    protected Playable playable;
    protected Speaker speaker;

    public PlayableDevice() {
    }

    public PlayableDevice(Playable playable, Speaker speaker) {
        this.playable = playable;
        this.speaker = speaker;
    }

    public void playMusic(Music music) {
        String voice = playable.playMusic(music);
        speaker.play(voice);
    }

}
