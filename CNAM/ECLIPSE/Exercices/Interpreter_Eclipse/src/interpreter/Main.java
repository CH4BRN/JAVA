package interpreter;

import interpreter.concretes.terminalExpression.Nb;
import interpreter.contracts.expressions.IAbstractExpression;
import misc.Parser;

public class Main {
	
	public static void main(String[] args)
	{
		String str = "neuf plus quatre";
		
		
		try {
			//Conversion de la string en expression
			IAbstractExpression exp = Parser.parse(str);
			// Selon l'élément du milieu (plus ou fois par exemple),
			// le parser renverra une operation "fois" ou "plus" avec les deux autres arguments
			// Selon la nature de cette operation interpret ne renverra pas le même resultat.
			System.out.println(str + " = " + exp.interpret());
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
