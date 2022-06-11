package CollectionsJava;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        System.out.println("Is HashSet empty " + hs.isEmpty()); // true as hs is empty

        System.out.println(hs.add("Cat")); // true because cat is inserted
        hs.add("Dog");
        hs.add("Squirrel");

        System.out.println("Size of HashSet: " + hs.size());

        Iterator<String> itr = hs.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println(hs.add("Cat")); // false as cat is already present

        System.out.println("Contians \"Dog\": " + hs.contains("Dog")); // true
        System.out.println(hs.remove("Dog")); // true as "Dog" is present
        System.out.println(hs.remove("Dog")); // false as "Dog" is absent
        System.out.println("Contians \"Dog\": " + hs.contains("Dog")); // false

        for(String str: hs) {
            System.out.println(str);
        }
    }
}
