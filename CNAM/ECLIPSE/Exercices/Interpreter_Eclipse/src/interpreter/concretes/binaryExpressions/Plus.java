package interpreter.concretes.binaryExpressions;

import interpreter.contracts.expressions.ABinaryExpression;
import interpreter.contracts.expressions.IAbstractExpression;

public class Plus extends ABinaryExpression{

	public Plus(IAbstractExpression exp1, IAbstractExpression exp2) {
		super(exp1, exp2);
		// 
	}

	@Override
	public int interpret() {
		// TODO Auto-generated method stub
		return exp1.interpret() + exp2.interpret();
	}

}
