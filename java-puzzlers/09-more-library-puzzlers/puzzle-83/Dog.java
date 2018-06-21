public class Dog extends Exception {
    public static final Dog INSTANCE = new Dog();
    private Dog() { }

    private Object readResolve() {
        // Accept no substitues!
        return INSTANCE;
    }
    
    public String toString() {
        return "Woof";
    }
}
