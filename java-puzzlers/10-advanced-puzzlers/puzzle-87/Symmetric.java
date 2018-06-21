public class Symmetric {
    public static void main(String[] args) {
        double x = (double) Long.MAX_VALUE;
        long y = Long.MAX_VALUE - 1;

        System.out.print((x == y) + " ");
        System.out.println(y == x);
    }
}
