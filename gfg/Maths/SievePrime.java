package Maths;

import java.util.Arrays;

public class SievePrime {
    public static void main(String[] args) {
        isPrime(30);
    }

    public static void isPrime(int n) {
        boolean[] primeNumbers = new boolean[n + 1];
        Arrays.fill(primeNumbers,true);
        
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(primeNumbers[i]) {
                for(int j = i * i; j <= n; j = j + i) {
                    primeNumbers[j] = false;
                }
            }
        }

        for(int i = 2; i <= n; i++) {
            if(primeNumbers[i]) {
                System.out.println(i);
            }
        }
    }
}
