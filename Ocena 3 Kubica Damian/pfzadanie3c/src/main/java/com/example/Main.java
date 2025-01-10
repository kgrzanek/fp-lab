// c. Zastosować formę (recur …) i policzyć Fib(10000)

package com.example;

import java.math.BigInteger;

public class Main {
    public static BigInteger fib(int n) {
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;

        for (int i = 2; i <= n; i++){
            BigInteger next = a.add(b);
            a = b;
            b = next;
        }
        return b;
    }


    public static void main(String[] args) {
        int n = 10000;
        BigInteger result = fib(n);
        System.out.println("Fibonacci dla " + n + " jest równy " + result);
    }
}