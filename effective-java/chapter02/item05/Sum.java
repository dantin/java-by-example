public class Sum {
    // Hideously slow program!
    public static void main(String[] args) {
        // FIX:
        // long sum = 0L;
        Long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
