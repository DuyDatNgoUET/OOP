package neon.exercise1;

import javafx.scene.transform.Scale;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Eratosthenes {
    static void primes(int n) {
        boolean A[] = new boolean[n+1];

        // gan tat ca cac phan tu cua mang la true
        for (int i = 2; i <= n; i++) {
            A[i] = true;
        }

        for (int i = 2; i <= sqrt(n); i++) {
            if (A[i] == true) {
                for (int j = i * i; j <= n; j += i) {
                    A[j] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (A[i] == true) {
                System.out.println(i);
            }
        }
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();

        Eratosthenes.primes(in);
    }
}
