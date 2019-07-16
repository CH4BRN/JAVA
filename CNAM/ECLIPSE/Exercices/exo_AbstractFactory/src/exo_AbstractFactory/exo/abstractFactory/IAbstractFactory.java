package exo_AbstractFactory.exo.abstractFactory;

import exo_AbstractFactory.exo.concretes.contracts.IThing;

public interface IAbstractFactory {
	
	public IThing createSimpleThing();
	
	public IThing createMoreComplexThing();

}
