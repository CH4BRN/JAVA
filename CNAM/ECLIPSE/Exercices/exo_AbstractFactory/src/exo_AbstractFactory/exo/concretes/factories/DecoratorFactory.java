package exo_AbstractFactory.exo.concretes.factories;

import exo_AbstractFactory.exo.abstractFactory.IAbstractFactory;
import exo_AbstractFactory.exo.adapter.DecoratorAdapter;
import exo_AbstractFactory.exo.concretes.MoreComplexThing;
import exo_AbstractFactory.exo.concretes.SimpleThing;
import exo_AbstractFactory.exo.concretes.contracts.IThing;

public class DecoratorFactory implements IAbstractFactory{

	@Override
	public DecoratorAdapter createSimpleThing() {
		// TODO Auto-generated method stub
		return new DecoratorAdapter(new SimpleThing("simple"));
	}

	@Override
	public DecoratorAdapter createMoreComplexThing() {
		// TODO Auto-generated method stub
		return new DecoratorAdapter(new MoreComplexThing("complex"));
	}

}
