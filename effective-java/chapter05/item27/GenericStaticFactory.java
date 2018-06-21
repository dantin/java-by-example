// Generic static factory method
package item27;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericStaticFactory {
    // Generic static factory method
    public static <K, V> HashMap<K, V> newHashMap() {
        return new HashMap<K, V>();
    }

    public static void main(String[] args) {
        // Parameterized type instance creation with static factory
        Map<String, List<String>> anagrams = newHashMap();
    }
}
