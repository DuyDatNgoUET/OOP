public class Numeral extends Expression {


    private int value ;

    public Numeral(int value) {
        this.value = value;
    }

    public Numeral() {
    }

    @Override
    public String toString() {
        String s = "";
        s += value;
        return s;
    }

    @Override
    public double evaluate() {
        return value;
    }
}
