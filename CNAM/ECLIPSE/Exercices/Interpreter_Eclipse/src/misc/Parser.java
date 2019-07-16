package misc;

import interpreter.concretes.binaryExpressions.Fois;
import interpreter.concretes.binaryExpressions.Moins;
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
    
     if(parts.length != 3 && parts.length != 7 && parts.length != 9){
     
        throw new IllegalExpressionException("Illegal expression : " + str);
    }
    
    // Sinon on récupère le premier nombre dans l'expression 1 
    // et le deuxième nombre dans l'expression 2
    IAbstractExpression e1 = new Nb(parts[0]);
    IAbstractExpression e2 = new Nb(parts[2]);
    
    /** Premier "jet"**/
    /*
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
    */
    
    //On récupère ensuite l'operation et on a donc la première expression
    IAbstractExpression operation1 = parseOperation(parts[1], e1, e2);
    if(parts.length == 9)
    {
    	//On récupère les deux nb suivants
    	IAbstractExpression e3 = new Nb(parts[4]);
        IAbstractExpression e4 = new Nb(parts[6]);
        IAbstractExpression e5 = new Nb(parts[8]);
        //On créé une nouvelle opération
        IAbstractExpression operation2 = parseOperation(parts[5], e3, e4);
        //ET on créé une dernière opération avec ces deux opérations comme "nb"
        IAbstractExpression operation = parseOperation(parts[3], operation1, operation2);
        
        IAbstractExpression op = parseOperation(parts[7], operation1, e5);
        return operation;
    }
    //Si l'expression comprend 7 "signes"
    if(parts.length == 7)
    {
    	//On récupère les deux nb suivants
    	IAbstractExpression e3 = new Nb(parts[4]);
        IAbstractExpression e4 = new Nb(parts[6]);
        //On créé une nouvelle opération
        IAbstractExpression operation2 = parseOperation(parts[5], e3, e4);
        //ET on créé une dernière opération avec ces deux opérations comme "nb"
        IAbstractExpression operation = parseOperation(parts[3], operation1, operation2);
        return operation;
    }
    else {
    	return operation1;
    }

    
    
}

private static IAbstractExpression parseOperation(String str, IAbstractExpression e1, IAbstractExpression e2) throws IllegalExpressionException{
	IAbstractExpression operation = null;
	
	switch(str) {
	case "fois" : operation = new Fois(e1, e2); break;
	case "plus" : operation = new Plus(e1, e2); break;
	case "moins" : operation = new Moins(e1, e2); break;
    default: throw new IllegalExpressionException("Illegal expression : '" + str + "' n'est pas un opérateur valable");
	}
	return operation;
}
}
