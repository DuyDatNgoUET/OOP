package PS;


public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator == 0) return;
        this.denominator = denominator;
    }

    public void Print() {
        System.out.println(this.numerator + "/" + this.denominator);
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
        if (denominator == 0) return;
        this.denominator = denominator;
    }

    public int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public Fraction() {
    }

    public Fraction reduce() {
        int gcd = gcd(this.numerator, this.denominator);
        if (this.denominator != 0 && this.numerator != 0) {
            this.setNumerator(numerator / gcd);
            this.setDenominator(denominator / gcd);
        } else {
            this.setNumerator(numerator);
            this.setDenominator(denominator);
        }

        return this;
    }


    public Fraction add(Fraction other) {
        Fraction tong = new Fraction();
        if (this.getDenominator() == 0 || other.getDenominator() == 0) return null;
        tong.setNumerator(this.getNumerator() * other.getDenominator() + this.getDenominator() * other.getNumerator());
        if (this.getDenominator() == 0 || other.getDenominator() == 0) return null;
        tong.setDenominator(this.getDenominator() * other.getDenominator());
        tong.reduce();
        return tong;
    }

    public Fraction subtract(Fraction other) {
        Fraction hieu = new Fraction();
        if (this.getDenominator() == 0 || other.getDenominator() == 0) return null;
        hieu.setNumerator(this.getNumerator() * other.getDenominator() - this.getDenominator() * other.getNumerator());
        if (this.getDenominator() == 0 || other.getDenominator() == 0) return null;
        hieu.setDenominator(this.getDenominator() * other.getDenominator());
        hieu.reduce();
        return hieu;
    }

    public Fraction multifly(Fraction other) {
        Fraction tich = new Fraction();

        tich.setNumerator(this.getNumerator() * other.getNumerator());
        if (this.getDenominator() == 0 || other.getDenominator() == 0) return null;
        tich.setDenominator(this.getDenominator() * other.getDenominator());
        tich.reduce();
        return tich;
    }

    public Fraction divide(Fraction other) {
        Fraction thuong = new Fraction();

        thuong.setNumerator(this.getNumerator() * other.getDenominator());
        if (other.getNumerator() == 0) return null;
        thuong.setDenominator(this.getDenominator() * other.getNumerator());

        thuong.reduce();
        return thuong;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Fraction)) return false;
        Fraction other = (Fraction) obj;
        return this.numerator * other.denominator == other.numerator * this.denominator;
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(3, 5);
        Fraction f2 = new Fraction(1, 2);
        Fraction f3 = f1.multifly(f2);
        f3.Print();

    }
}
