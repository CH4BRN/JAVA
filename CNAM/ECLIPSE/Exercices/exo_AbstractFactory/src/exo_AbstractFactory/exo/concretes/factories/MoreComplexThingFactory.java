package exo_AbstractFactory.exo.concretes.factories;

import exo_AbstractFactory.exo.abstractFactory.IAbstractFactory;
import exo_AbstractFactory.exo.concretes.MoreComplexThing;
import exo_AbstractFactory.exo.concretes.SimpleThing;
import exo_AbstractFactory.exo.concretes.contracts.IThing;

public class MoreComplexThingFactory implements IAbstractFactory{

	@Override
	public IThing createSimpleThing() {
		// TODO Auto-generated method stub
		return new SimpleThing("__simplething");
	}

	@Override
	public IThing createMoreComplexThing() {
		// TODO Auto-generated method stub
		return new MoreComplexThing("__morecomplexthing");
	}

}
