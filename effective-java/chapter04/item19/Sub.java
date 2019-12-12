import java.time.Instant;

// Demostration of what can go wrong when you override a method called from constructor!
public final class Sub extends Super {
    // Blank final, set by constructor
    private final Instant instant;

    public Sub() {
        instant = Instant.now();
    }

    // Overriding method invoked by superclass constructor
    @Override
    public void overrideMe() {
        System.out.println(instant);
    }

    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.overrideMe();
    }
}
