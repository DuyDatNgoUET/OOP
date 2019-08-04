public class Multiplication extends BinaryExpression {
    public Multiplication(Expression right, Expression left) {
        super(right, left);
    }

    @Override
    public double evaluate() {
        return 0;

    }
}
