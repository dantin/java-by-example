import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {

    private List<Shape> shapes = new ArrayList<>();

    @Override
    public void draw(String fillColor) {
        for (Shape s : shapes) {
            s.draw(fillColor);
        }
    }

    public void add(Shape s) {
        this.shapes.add(s);
    }

    public void remove(Shape s) {
        this.shapes.remove(s);
    }

    public void clear() {
        System.out.println("Clear all the shapes from drawing");
        this.shapes.clear();
    }
}
