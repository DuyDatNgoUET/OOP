package neon.exercise1;

public class Fibonaxi {
    // a=2 ; f(2) = f(1) + f(0)
    // a=3 ; f(3) = f(2) + f(1) = f(1)+f(0) +f(1) = 2f(1) +1f(0)
    // a=4 ; f(4) = f(3) + f(2) = 2f(1) +f(0) + f(1) + f(0)
    // = 3f(1) + 2f(0)

    // a=5 ; f(5) = f(4) +f(3) = 3f(1) +2f(0) + 2f(1) + 1f(0)
    // = 5f(1) + 3f(0)
      public int Fibonaxi(int n ){
            if(n==0) return 0;
            else if(n==1) return 1;
            else if(n>=2) return (Fibonaxi(n-1) + Fibonaxi(n-2));
            return 0;
        }



}
