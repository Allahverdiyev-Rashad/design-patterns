package behaviouralpatterns.state;

public class Attack implements State {
    @Override
    public void pressSquare() {
        System.out.println("Square pressed for attack");
    }

    @Override
    public void pressTriangle() {
        System.out.println("Triangle pressed for attack");
    }

    @Override
    public void pressCircle() {
        System.out.println("Circle pressed for attack");
    }

    @Override
    public void pressX() {
        System.out.println("X pressed for attack");
    }
}
