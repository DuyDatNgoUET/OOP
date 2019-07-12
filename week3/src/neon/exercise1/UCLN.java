package neon.exercise1;


import java.util.Scanner;
//import your library
public class UCLN {
    public static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }

    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);
        int s1 = sc1.nextInt();
        int s2 = sc1.nextInt();

        int result = UCLN.gcd(s1,s2);
        System.out.println(result);
    }

}