package interpreter;

public class Fois extends BinaryExpression {
    public Fois(AbstractExpression exp1, AbstractExpression exp2){
        super(exp1, exp2);
    }
    public int interpret() {
        return exp1.interpret() * exp2.interpret();
    }
}