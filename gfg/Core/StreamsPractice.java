package Core;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.*;

public class StreamsPractice {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for(int i = 1; i <= 10; i++) {
            list.add(i);
        }

        List<Integer> squareList = list.stream()
                                        .map(x -> x * x)
                                        .collect(Collectors.toList());

        System.out.println(squareList);

        List<Integer> evenList = list.stream()
                                     .filter(x -> x % 2 == 0)
                                     .collect(Collectors.toList());

        System.out.println(evenList);

        list.add(100);
        list.add(50);
        list.add(49);
        list.add(70);

        System.out.println(list);

        System.out.println("sorted list");
        list = list.stream()
                    .sorted()
                    .collect(Collectors.toList());
        System.out.println(list);

        list.stream().forEach(x -> System.out.print(x + " "));
        System.out.println();

        int sum = list.stream().reduce(0, (ans, i) -> ans + i);
        System.out.println(sum);
    }
}
