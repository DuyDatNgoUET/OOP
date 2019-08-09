class Division extends BinaryExpression {
    private Expression left;
    private Expression right;

    public Division (Expression left, Expression right)
    {
        super(left, right);
    }

    @Override
    public Expression left() {
        return left;
    }

    @Override
    public Expression right() {
        return right;
    }

    @Override
    public String toString() {
        String s = "(" + left.toString() + " / " + right.toString() + ")";
        return s;
    }

    @Override
    public double evaluate() {
        if (right.evaluate() == 0) throw new ArithmeticException("Lỗi chia cho 0");
        return left.evaluate()/right.evaluate();
    }
}