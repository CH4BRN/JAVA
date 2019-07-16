package exo_AbstractFactory.exo.adapter;

import exo_AbstractFactory.exo.concretes.contracts.IThing;
import exo_AbstractFactory.exo.decorator.IDecorator;

public class DecoratorAdapter implements IDecorator, IThing {
	
	public DecoratorAdapter(IThing thing)
	{
		this.thing = thing;
	}
	
	public IThing thing;

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return thing.getName();
	}

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		thing.operation();
	}

}
