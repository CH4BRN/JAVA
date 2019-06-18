package chainOfResponsibility.handlers;

public class ConcreteHandler_B extends AHandler{

	public double getAllowable() { return BASE * 20; }

	@Override
	public
	
	String getRole() { return this.getClass().getSimpleName(); }
}
