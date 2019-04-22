import java.awt.Color;
import java.awt.Graphics;

public class Oval implements Shape {

    private boolean fill;

    public Oval(boolean f) {
        System.out.println("Creating Oval Object with fill = " + f);
        this.fill = f;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void draw(Graphics oval, int x, int y, int width, int height, Color color) {
        oval.setColor(color);
        oval.drawOval(x, y, width, height);
        if (fill) {
            oval.fillOval(x, y, width, height);
        }
    }
}
