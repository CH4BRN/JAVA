package interpreter;

public class Plus extends BinaryExpression {
    public Plus(AbstractExpression exp1, AbstractExpression exp2){
        super(exp1, exp2);
    }
    public int interpret() {
        return exp1.interpret() + exp2.interpret();
    }
}