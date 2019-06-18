package interpreter;

public class UnPlusUn{

    public static void main(String[] args) {
        
        // Vérification des paramètres
        String usage = "Utilisation : java UnPlusUn <expression>\nExemple : java UnPlusUn \"deux plus trois\"";
        
        if(args.length != 1){
            System.out.println(usage);
            System.exit(-1);
        }
        
        try{
            AbstractExpression exp = parse(args[0]);
            System.out.println(args[0] + " = " + exp.interpret());
            
        }
        catch(IllegalExpressionException e){
            e.printStackTrace();
        }
    }
    
    /** 
        Méthode auxiliaire, qui effectue le parsing
        Transforme une chaîne en AST
        Etape antérieure à l'interprétation, ne fait pas partie du pattern Interpreter
    **/
    static AbstractExpression parse(String str) throws IllegalExpressionException{
        String[] parts = str.split(" ");
        if(parts.length != 3){
            throw new IllegalExpressionException("Illegal expression : " + str);
        }
        AbstractExpression e1 = new Nb(parts[0]);
        AbstractExpression e2 = new Nb(parts[2]);
        
        AbstractExpression operation = null;
        switch(parts[1]){
        	case "fois" : operation = new Fois(e1, e2); break;
        	case "plus" : operation = new Plus(e1, e2); break;
            default: throw new IllegalExpressionException("Illegal expression '" + str + "' : '" + parts[1] + "' n'est pas un opérateur valable");
        }
        return operation;
    }
}