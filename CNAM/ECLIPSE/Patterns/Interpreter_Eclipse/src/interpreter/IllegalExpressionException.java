package interpreter;

public class IllegalExpressionException extends Exception{
    public IllegalExpressionException(String msg){
        super(msg);
    }
}