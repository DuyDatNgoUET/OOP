package neon.exercise1;

import static java.lang.Math.abs;

public class UCLN {
   int UCLN(int a, int b){
       int abs_a = abs(a);
       int abs_b = abs(b);
       if(abs_a==0 || abs_b ==0){
           return a+b;
       }
       if(abs_a!=0 && abs_b !=0){
           while(abs_a!=abs_b){
               if(abs_a>abs_b) abs_a-= abs_b;
               abs_b-=abs_a;
           }

       }
       return abs_a;
   }

}
