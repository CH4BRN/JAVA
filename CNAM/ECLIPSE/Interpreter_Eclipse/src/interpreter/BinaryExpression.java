package interpreter;

abstract class BinaryExpression implements AbstractExpression {
    
    protected AbstractExpression exp1, exp2;
    
    public BinaryExpression(AbstractExpression exp1, AbstractExpression exp2){
        this.exp1 = exp1;
        this.exp2 = exp2;
    }
}
