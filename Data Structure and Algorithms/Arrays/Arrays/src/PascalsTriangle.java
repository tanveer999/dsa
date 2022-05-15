import java.util.List;
import java.util.ArrayList;

public class PascalsTriangle {

    public static void main(String[] args) {
        List<List<Integer>> output = generate(5);

        System.out.println(java.util.Arrays.toString(output.toArray()));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();

            for(int j = 0; j < i + 1; j++) {
                if(j == 0 || j == i) {
                    list.add(1);
                } else {
                    int a = result.get(i - 1).get(j - 1);
                    int b = result.get(i - 1).get(j);

                    list.add(a + b);
                }
            }
            result.add(list);
        }
        return result;
    }
}
