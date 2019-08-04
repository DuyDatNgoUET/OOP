public class Division extends BinaryExpression {
    public Division(Expression right, Expression left) {
        super(right, left);
    }

    @Override
    public double evaluate() {
        return 0;

    }
}
