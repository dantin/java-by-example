// Takes earch-weight and prints table of weight on all planets
package item30;

public class WeightTable {
    public static void main(String[] args) {
        double earchWeight = Double.parseDouble(args[0]);
        double mass = earchWeight / Planet.EARTH.surfaceGravity();
        for (Planet p : Planet.values())
            System.out.printf("Weight on %s is %f%n", p, p.surfaceWeight(mass));
    }
}
