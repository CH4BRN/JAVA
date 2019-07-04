package misc;

import interpreter.concretes.binaryExpressions.Fois;
import interpreter.concretes.binaryExpressions.Plus;
import interpreter.concretes.terminalExpression.Nb;
import interpreter.contracts.expressions.IAbstractExpression;
import interpreter.exceptions.IllegalExpressionException;

public class Parser {

    /** 
    Méthode auxiliaire, qui effectue le parsing
    Transforme une chaîne en AST
    Etape antérieure à l'interprétation, ne fait pas partie du pattern Interpreter
**/
public static IAbstractExpression parse(String str) throws IllegalExpressionException{
	//Split la chaine
    String[] parts = str.split(" ");
    //Si le resultat est trop long, exception
    if(parts.length != 3){
        throw new IllegalExpressionException("Illegal expression : " + str);
    }
    // Sinon on récupère le premier nombre dans l'expression 1 
    // et le deuxième nombre dans l'expression 2
    IAbstractExpression e1 = new Nb(parts[0]);
    IAbstractExpression e2 = new Nb(parts[2]);
    IAbstractExpression operation = null;
    //Switch sur le signe 
    switch(parts[1]){
    	//Si c'est "fois" on créé une expression binaire "fois"
        case "fois" : operation = new Fois(e1, e2); break;
        // Si c'est plus ...
        case "plus" : operation = new Plus(e1, e2); break;
        default: throw new IllegalExpressionException(
            "Illegal expression '" + str + "' : '" + parts[1] + "' n'est pas un opérateur valable"
        );
    }
    return operation;
}
}
