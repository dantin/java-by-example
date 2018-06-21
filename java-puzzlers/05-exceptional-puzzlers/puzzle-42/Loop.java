public class Loop {
    public static void main(String[] args) {
        int[][] tests = { { 6, 5, 4, 3, 2, 1 }, { 1, 2 },
                          { 1, 2, 3 }, { 1, 2, 3, 4}, { 1 } };
        int n = 0;


        for (int[] test : tests) {
            if (thirdElementIsThree(test))
                n++;
        }
        System.out.println(n);
    }

    private static boolean thirdElementIsThree(int[] a) {
        return a.length >= 3 && a[2] == 3;
    }
}
