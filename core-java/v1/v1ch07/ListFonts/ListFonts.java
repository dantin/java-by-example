import java.awt.*;

/**
 * List local fonts
 *
 * @version 1.0 2018-05-11
 */
public class ListFonts {
    public static void main(String[] args) {
        String[] fontNames = GraphicsEnvironment
            .getLocalGraphicsEnvironment()
            .getAvailableFontFamilyNames();
        for (String fontName : fontNames) {
            System.out.println(fontName);
        }
    }
}
