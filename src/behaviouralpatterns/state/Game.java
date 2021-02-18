package behaviouralpatterns.state;

public class Game {
    private State console;

    public Game() {
        System.out.println("Game started" +
                "\nDefault State is defence");
        console = new Defence();
    }

    public void square() {
        console.pressSquare();
    }

    public void triangle() {
        console.pressTriangle();
    }

    public void circle() {
        console.pressCircle();
    }

    public void x() {
        console.pressX();
    }

    public void changeStateToAttack() {
        System.out.println("---------State changed----------");
        console = new Attack();
    }

    public void changeStateToDefence() {
        System.out.println("---------State changed----------");
        console = new Defence();
    }
}
