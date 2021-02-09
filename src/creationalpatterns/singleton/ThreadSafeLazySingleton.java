package creationalpatterns.singleton;

// Lazy Loading singleton pattern ---- it is thread safe
public class ThreadSafeLazySingleton {
    private static volatile ThreadSafeLazySingleton singleton;

    private ThreadSafeLazySingleton() {

    }

    public static ThreadSafeLazySingleton getLazySingleton() {
        // Double checked locked principle
        if (singleton == null) {
            synchronized (ThreadSafeLazySingleton.class) {
                if (singleton == null) {
                    singleton = new ThreadSafeLazySingleton();
                }
            }
        }
        return singleton;
    }
}
