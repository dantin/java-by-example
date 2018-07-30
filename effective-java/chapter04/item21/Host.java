// version 1.0 2018-07-30

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

// Exporting a concrete strategy
public class Host {
    private static class StrLenCmp implements Comparator<String>, Serializable {
        public int compare(String s1, String s2) {
            return s1.length() - s2.length();
        }
    }

    // Returned comparator is serializable
    private static final Comparator<String> STRING_LENGTH_COMPARATOR = new StrLenCmp();

    public static void main(String[] args) {
        String[] stringArray = new String[]{"a", "abc", "asdf", "bc"};
        System.out.println(Arrays.toString(stringArray));
        Arrays.sort(stringArray, STRING_LENGTH_COMPARATOR);
        System.out.println(Arrays.toString(stringArray));
    }
}
