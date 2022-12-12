package structuralpatterns.bridge.second;

public class Headphone implements Speaker {

    @Override
    public void play(String voice) {
        System.out.println("Speaker is running " + voice);
    }

}
