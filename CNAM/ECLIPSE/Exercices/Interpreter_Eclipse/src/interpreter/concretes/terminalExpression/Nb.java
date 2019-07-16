package interpreter.concretes.terminalExpression;

import interpreter.contracts.expressions.IAbstractExpression;
import interpreter.exceptions.IllegalExpressionException;

public class Nb implements IAbstractExpression{


	
    private int value;
    public Nb(String str) throws IllegalExpressionException{
        switch(str)
        {
            case "un" : value = 1; break;
            case "deux" : value = 2; break;
            case "trois" : value = 3; break;
            case "quatre" : value = 4; break;
            case "cinq" : value = 5; break;
            case "six" : value = 6; break;
            case "sept" : value = 7; break;
            case "huit" : value = 8; break;
            case "neuf" : value = 9; break;
            case "dix" : value = 10; break;
            default:
                throw new IllegalExpressionException("Illegal number string : " + str);
         }
        }
    
	@Override
	public int interpret() {
		// TODO Auto-generated method stub
	      return value;
	}
}
