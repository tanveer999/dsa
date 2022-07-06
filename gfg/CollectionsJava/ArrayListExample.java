package CollectionsJava;

import java.util.Iterator;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(5);
        // output:
        // [] and Size is: 0
        System.out.println(arr + " and Size is: " + arr.size());

        for(int i = 1; i <= 5; i++) {
            arr.add(i);
        }

        System.out.println("Using Iterator: ");
        Iterator<Integer> itr = arr.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        arr.add(5, 6); // index of current element or size()
        // arr.add(7, 7); // IndexOutOfBoundsException

        // output
        // [1, 2, 3, 4, 5, 6] and Size is: 6
        // arr.add(0,0); // add element and doesn't replace
        System.out.println(arr + " and Size is: " + arr.size());

        // output
        // 1
        System.out.println(arr.get(0));

        //output
        // 2
        System.out.println(arr.indexOf(3));
        
        // output
        // false
        System.out.println(arr.isEmpty());

        // output
        // 2 and array is: [1, 3, 4, 5, 6]
        System.out.println(arr.remove(1) + " and array is: " + arr);
        // System.out.println(arr.remove(10) + " and array is: " + arr); // Index out of bound exception

        arr.add(1, 2);
        System.out.println(arr); // [1, 2, 3, 4, 5, 6]

        Integer i = 1;
        System.out.println(arr.remove(i) + " array is:" + arr); // true array is:[2, 3, 4, 5, 6]
        i = 20; // element not present
        System.out.println(arr.remove(i)); // false
        arr.add(0, 10);
        System.out.println(arr); // [10, 2, 3, 4, 5, 6]

        System.out.println(arr.contains(10)); // true
        System.out.println(arr.contains(20)); // false

        System.out.println(arr.set(0, 1)); // 10 (old value)
        System.out.println(arr); // [1, 2, 3, 4, 5, 6]

        ArrayList<Integer> arr2 = new ArrayList<>();
        System.out.println(arr2.size() + " array is: " + arr2); //0 array is: []
        arr.ensureCapacity(10);
        System.out.println(arr2.size() + " array is: " + arr2); //0 array is: []
        arr2.add(100);
        System.out.println(arr2); // [100]
        arr2.addAll(arr);
        System.out.println(arr2); // [100, 1, 2, 3, 4, 5, 6]

        arr.clear();
        System.out.println(arr); // []
        
        
    }    
}
