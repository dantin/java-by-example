
public class Main {

    public static void main(String[] args) {
        Shape t1 = new Triangle();
        Shape t2 = new Triangle();
        Shape c = new Circle();

        Drawing d = new Drawing();
        d.add(t1);
        d.add(t2);
        d.add(c);

        d.draw("Red");
        d.clear();
        d.add(t1);
        d.add(c);
        d.draw("Green");
    }
}
