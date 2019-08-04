public class Square extends Expression {
    @Override
    void modifier() {

    }

    private Expression expression;

    public Square(Expression expression) {
        this.expression = expression;
    }

    @Override
    public double evaluate() {
        return 0;
    }
}
