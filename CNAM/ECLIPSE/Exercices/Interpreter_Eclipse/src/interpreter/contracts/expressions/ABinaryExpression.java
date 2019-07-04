package interpreter.contracts.expressions;
/**
 * Expression composée
 * @author pierre.antoine
 *
 */
public abstract class ABinaryExpression implements IAbstractExpression {
	
	protected IAbstractExpression exp1, exp2;
	
	public ABinaryExpression(IAbstractExpression exp1, IAbstractExpression exp2)
	{
		this.exp1 = exp1;
		this.exp2 = exp2;
	}

}
