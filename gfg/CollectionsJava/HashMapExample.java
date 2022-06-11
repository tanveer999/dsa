package CollectionsJava;

import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
// import java.util.Iterator;  // iterator method is not present

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        
        System.out.println(hm.isEmpty());
        System.out.println(hm.size());

        hm.put("a", 65);
        hm.put("b", 66);
        hm.put("c", 67);

        System.out.println(hm); // {a=65, b=66, c=67}

        System.out.println("Contains key \"a\" " + hm.containsKey("a")); // true
        System.out.println("Contains key \"d\" " + hm.containsKey("d")); // false

        System.out.println("Contains value 65" + hm.containsValue(65)); // true
        System.out.println("Contains value 68" + hm.containsValue(68)); // false

        System.out.println(hm.get("a")); // 65
        System.out.println(hm.getOrDefault("a", 0)); //65
        System.out.println(hm.getOrDefault("d", 0)); // 0 as "d" is not present

        Set<String> hs = new HashSet<String>();
        hs = hm.keySet();

        System.out.println("Print keys in hm: ");
        for(String str : hs) {
            System.out.print(str + " ");
        }
        System.out.println();
        
        System.out.println(hm.toString()); // {a=65, b=66, c=67}
        
        for(Map.Entry<String, Integer> map : hm.entrySet()) {
            System.out.println(map.getKey() + "=" + map.getValue());
        }
    }
}
