public class Square extends Expression {


    private Expression expression;

    public Square(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        String s = "(" + expression.toString() + ")^2";
        return s;
    }

    @Override
    public double evaluate() {
        return expression.evaluate() * expression.evaluate();
    }
}
