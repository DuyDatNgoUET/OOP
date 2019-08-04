public class BinaryExpression extends Expression {
    @Override
    void modifier() {

    }

    private Expression right;
    private Expression left;

    public BinaryExpression(Expression right, Expression left) {
        this.right = right;
        this.left = left;
    }

    @Override
    public double evaluate() {
        return 0;
    }
}
