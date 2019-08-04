public class Addition extends BinaryExpression {
    public Addition(Expression right, Expression left) {
        super(right, left);
    }

    @Override
    public double evaluate() {
        return 0;
    }
}
