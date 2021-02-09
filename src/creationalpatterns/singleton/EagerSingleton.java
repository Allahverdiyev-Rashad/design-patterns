package creationalpatterns.singleton;

// Eager Loading singleton pattern --- Thread safe but not efficient
public class EagerSingleton {
    private static EagerSingleton singleton = new EagerSingleton();

    private EagerSingleton(){

    }

    public static EagerSingleton getEagerSingleton() {
        return singleton;
    }
}
