package neon.exercise1;


import java.util.Scanner;
//import your library
public class UCLN {
    public static int gcd(int a, int b){
        if(a==0 || b==0){
            return a+b;
        }
        if(a>b) return gcd(a-b,b);
        return gcd(a,b-a);
    }

    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);
        int s1 = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        int s2 = sc2.nextInt();

        int result = UCLN.gcd(s1,s2);
        System.out.println(result);
    }

}