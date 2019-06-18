package chainOfResponsibility.handlers;

public class ConcreteHandler_E extends AHandler{

	@Override
	public double getAllowable() { return Double.MAX_VALUE; }

	@Override
	public String getRole() { return this.getClass().getSimpleName(); }
}
