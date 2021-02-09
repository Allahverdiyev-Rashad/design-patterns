package creationalpatterns.singleton;

import java.lang.reflect.Constructor;

// Reflection can be used to destroy
// EagerSingleton, SimpleLazySingleton, ThreadSafeLazySingleton, BillPughSingleton
// the above singleton implementation approaches
public class DestroySingletonWithReflection {
    public static void main(String[] args) {
        EagerSingleton instanceOne = EagerSingleton.getEagerSingleton();
        EagerSingleton instanceTwo = null;
        try {
            Constructor[] constructors = EagerSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (EagerSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }

}
