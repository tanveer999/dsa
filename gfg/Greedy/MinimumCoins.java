package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumCoins {
    public static void main(String[] args) {
        ArrayList<Integer> coins = new ArrayList<>();
        int amount = 57;
        coins.add(5);
        coins.add(10);
        coins.add(2);
        coins.add(1);
        findMinCoins(coins, amount);
    }

    static void findMinCoins(List<Integer> coins, int amount) {
        Collections.sort(coins, Collections.reverseOrder());

        int res = 0;

        for(int coin : coins) {
            int c = (int) Math.floor(amount / coin);
            res += c;
            amount -= c * coin;

            if(amount == 0)
                break;
        }
        System.out.println(res);
    }

}
