public class Abc {
    public static void main(String[] args) {
        String letters = "ABC";
        char[] numbers = { '1', '2', '3' };
        System.out.println(letters + " easy as " + numbers);

        System.out.println('a');

        System.out.println(letters + " easy as " + String.valueOf(numbers));
        System.out.println(numbers);

        Object ns = numbers;
        System.out.println(ns);  // Invokes println (Object)
    }
}
