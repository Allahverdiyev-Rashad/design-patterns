package creationalpatterns.singleton;

// Both eager initialization and static block initialization creates the instance even before it’s being used and
// that is not the best practice to use.
public class StaticEagerSingleton {

    private static StaticEagerSingleton singleton;

    private StaticEagerSingleton() {
    }

    //static block initialization for exception handling
    static {
        try {
            singleton = new StaticEagerSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static StaticEagerSingleton getSingleton() {
        return singleton;
    }
}
