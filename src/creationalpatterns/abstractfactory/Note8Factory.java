package creationalpatterns.abstractfactory;

public class Note8Factory implements PhoneFactory {

    @Override
    public Phone getPhone(String model, String battery, int width, int height) {
        return new Note8(model, battery, width, height);
    }
}
