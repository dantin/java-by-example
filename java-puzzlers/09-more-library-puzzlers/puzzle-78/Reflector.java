import java.util.*;
import java.lang.reflect.*;

public class Reflector {
    public static void main(String[] args) throws Exception {
        Set<String> s = new HashSet<String>();
        s.add("foo");
        Iterator it = s.iterator();
        Method m = Iterator.class.getMethod("hasNext");
        System.out.println(m.invoke(it));
    }
}
