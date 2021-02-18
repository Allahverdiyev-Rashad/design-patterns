package behaviouralpatterns.state;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();

        game.x();
        game.triangle();
        game.square();

        game.changeStateToAttack();

        game.x();
        game.square();

        game.changeStateToDefence();
    }
}
