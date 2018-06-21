public class MyThing extends Thing {
    private final int arg;

    public MyThing() {
        this((int)System.currentTimeMillis());
    }

    public MyThing(int i) {
        super(i);
        arg = i;
    }
}
