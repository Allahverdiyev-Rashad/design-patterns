package creationalpatterns.singleton;

// Lazy Loading singleton pattern ---- this example is not thread safe
public class SimpleLazySingleton {
    private static SimpleLazySingleton singleton;

    private SimpleLazySingleton() {

    }

    public static SimpleLazySingleton getLazySingleton() {
        if (singleton == null) {
            singleton = new SimpleLazySingleton();
        }
        return singleton;
    }
}
