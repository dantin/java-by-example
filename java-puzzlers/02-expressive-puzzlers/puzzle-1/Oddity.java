public class Oddity {
    public static boolean isOdd(int i) {
        return i % 2 == 1;
        //return i % 2 == 0;
        // return (i & 1) != 0;
    }

    public static void main(String[] args) {
        System.out.printf("%d: %s\n", 1, isOdd(1));
        System.out.printf("%d: %s\n", 2, isOdd(2));
        System.out.printf("%d: %s\n", -1, isOdd(-1));
        System.out.printf("%d: %s\n", -2, isOdd(-2));
    }
}
