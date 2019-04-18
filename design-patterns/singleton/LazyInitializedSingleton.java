
public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {}

    public static LazyInitializedSingleton getInstance() {
        // FIXME: unthread-safe
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
