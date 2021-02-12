package creationalpatterns.abstractfactory;

public class S8Factory implements PhoneFactory {

    @Override
    public Phone getPhone(String model, String battery, int width, int height) {
        return new S8(model, battery, width, height);
    }
}
