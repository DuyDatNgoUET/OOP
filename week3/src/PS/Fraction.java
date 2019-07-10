

public class Fraction {
    private int numerator ;
    private int denominator;

    public Fraction() {
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }


    public int reduce(int a, int b){
        if(a==0 || b==0) return a+b;
        else if(a>b) return reduce(a-b,b);
        return reduce(a,b-a);
    }

    public void add(Fraction p1, Fraction p2){
        this.numerator = p1.numerator*p2.denominator + p2.numerator*p1.denominator;
        this.denominator = p1.denominator*p2.denominator;
    }

    public void subtract(Fraction p1, Fraction p2){
        this.numerator = p1.numerator*p2.denominator - p2.numerator*p1.denominator;
        this.denominator = p1.denominator*p2.denominator;
    }

    public void multiply(Fraction p1, Fraction p2){
        this.numerator = p1.numerator*p2.numerator;
        this.denominator = p1.denominator*p2.denominator;
    }

    public void devide(Fraction p1, Fraction p2){
        this.numerator = p1.numerator*p2.denominator;
        this.denominator = p1.denominator*p2.numerator;
    }

    public boolean equals(Object obj ){
        return false;

    }
}
