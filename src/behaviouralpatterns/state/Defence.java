package behaviouralpatterns.state;

public class Defence implements State {
    @Override
    public void pressSquare() {
        System.out.println("Square pressed for defence");
    }

    @Override
    public void pressTriangle() {
        System.out.println("Triangle pressed for defence");
    }

    @Override
    public void pressCircle() {
        System.out.println("Circle pressed for defence");
    }

    @Override
    public void pressX() {
        System.out.println("X pressed for defence");
    }
}
