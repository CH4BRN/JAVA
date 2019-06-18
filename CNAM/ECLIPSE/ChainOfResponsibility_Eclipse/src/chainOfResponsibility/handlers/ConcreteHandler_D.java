package chainOfResponsibility.handlers;

public class ConcreteHandler_D extends AHandler{

	@Override
	public double getAllowable() { return BASE * 60; }

	@Override
	public String getRole() { return this.getClass().getSimpleName(); }

}
