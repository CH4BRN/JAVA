package chainOfResponsibility.request;

public class RequestObject {
	public RequestObject(double amount) 
	{ 
		this.amount = amount; 
	}
	
	private double amount;
    
    public double getAmount() 
    { 
    	return this.amount; 
    }
    public void setAmount(double amount) 
    { 
    	this.amount = amount; 
    }
}
