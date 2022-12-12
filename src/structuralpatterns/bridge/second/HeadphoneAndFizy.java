package structuralpatterns.bridge.second;

public class HeadphoneAndFizy extends PlayableDevice {
    public HeadphoneAndFizy() {
        playable = new Fizy();
        speaker = new Headphone();
    }

    @Override
    public void playMusic(Music music) {
        System.out.println("Computer running... ");
        super.playMusic(music);
    }

}
