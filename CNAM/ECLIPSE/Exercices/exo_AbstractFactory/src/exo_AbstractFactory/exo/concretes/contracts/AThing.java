package exo_AbstractFactory.exo.concretes.contracts;

public abstract class AThing implements IThing{
	
	/**
	 * @param name
	 */
	public AThing(String name)
	{
		this.name = name;
	}
	
	/* (non-Javadoc)
	 * @see exo_AbstractFactory.exo.concretes.contracts.IThing#operation()
	 */
	@Override
	public void operation()
	{
		System.out.println(this.getName());
	}
	
	/**
	 * 
	 */
	public String name;
	
	/* (non-Javadoc)
	 * @see exo_AbstractFactory.exo.concretes.contracts.IThing#getName()
	 */
	@Override
	public String getName()
	{
		return this.name;
	}
}
