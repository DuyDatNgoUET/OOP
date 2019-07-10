package neon.exercise1;

import java.util.Scanner;

public class Fibonaxi {
    public static int Fibonacci(int n) {
        if(n==0) return 0;
        else if (n == 1 || n == 2) return 1;
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();

        int result =  Fibonaxi.Fibonacci(in);
        System.out.println(result);
    }
}
