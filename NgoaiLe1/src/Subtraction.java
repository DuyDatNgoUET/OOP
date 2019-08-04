public class Subtraction extends BinaryExpression {
    public Subtraction(Expression right, Expression left) {
        super(right, left);
    }

    @Override
    public double evaluate() {
        return 0;
    }
}
