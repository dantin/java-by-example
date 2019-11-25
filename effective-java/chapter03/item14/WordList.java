// version 1.0 2018-07-24

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;

public class WordList {
    public static void main(String[] args) {
        Set<String> s = new TreeSet<String>();
        Collections.addAll(s, args);
        System.out.println(s);
        s = new HashSet<String>();
        Collections.addAll(s, args);
        System.out.println(s);
    }
}
