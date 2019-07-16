package interpreter.concretes.binaryExpressions;

import interpreter.contracts.expressions.ABinaryExpression;
import interpreter.contracts.expressions.IAbstractExpression;

public class Moins extends ABinaryExpression{

	public Moins(IAbstractExpression exp1, IAbstractExpression exp2) {
		super(exp1, exp2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int interpret() {
		// TODO Auto-generated method stub
		return exp1.interpret() - exp2.interpret();
	}
	
	

}
