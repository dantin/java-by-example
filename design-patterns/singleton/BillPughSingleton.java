
public class BillPughSingleton {

    private BillPughSingleton() {}

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        // NOTICE: When the singleton class is loaded, SingletonHelper class is not loaded into memery
        //         any only when someone calls the getInstance method.
        return SingletonHelper.INSTANCE;
    }
}
