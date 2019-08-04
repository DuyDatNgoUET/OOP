public class Numeral extends Expression {
    @Override
    void modifier() {

    }

    private int value ;

    public Numeral(int value) {
        this.value = value;
    }

    public Numeral() {
    }

    @Override
    public double evaluate() {
        return 0;
    }
}
