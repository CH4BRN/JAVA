package decorator;

public abstract class AbstractDecorator implements IConcrete{
	
	public AbstractDecorator(AbstractDecorator component, String name)
	{
		this.component = component;
		this.name = name;
	}
	
	public String name;
	
	AbstractDecorator component;
	
	@Override
	public void operation()
	{
		if(this.component != null)
		{
			this.component.operation();
		}	
		
		System.out.println("Display : " + this.getClass().getSimpleName() + " - " + this.name);
	}

}
