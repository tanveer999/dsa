package Greedy;

import java.util.Arrays;

class Item implements Comparable<Item>{
    int weight;
    int value;

    Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }

    @Override
    public int compareTo(Item item) {
        return (int) (item.value / item.weight) - (this.value / this.weight);
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", weight, value);
    }

}

public class FractionalKnapsack {
    public static void main(String[] args) {
        Item[] items = new Item[3];
        int sum = 70;
        items[0] = new Item(50, 600);
        items[1] = new Item(20, 500);
        items[2] = new Item(30, 400);

        System.out.println(findOptimalValue(items, sum));
    }

    static int findOptimalValue(Item[] items, int sum) {
        Arrays.sort(items);
        System.out.println(Arrays.toString(items));
        int res = 0;
        for(int i = 0; i < items.length; i++) {
            if(sum - items[i].weight >= 0) {
                res += items[i].value;
                sum -= items[i].weight;
            } else {
                int temp = (int) (((double) sum / items[i].weight) * items[i].value);
                System.out.println(temp);
                res += temp;
                return res;
            }
        }
        return res;
    }
}
