package exo_AbstractFactory.exo;

import exo_AbstractFactory.exo.abstractFactory.IAbstractFactory;
import exo_AbstractFactory.exo.concretes.contracts.IThing;
import exo_AbstractFactory.exo.concretes.factories.DecoratorFactory;
import exo_AbstractFactory.exo.concretes.factories.MoreComplexThingFactory;
import exo_AbstractFactory.exo.concretes.factories.SimpleThingFactory;
import exo_AbstractFactory.exo.decorator.Decorator;

public class Client {

	
	public void Simulation_1()
	{
		IAbstractFactory simpleFactory = new SimpleThingFactory();
		
		IThing first_thing = simpleFactory.createSimpleThing();
		first_thing.operation();
				
		IAbstractFactory complexFactory = new MoreComplexThingFactory();
		IThing second_thing = complexFactory.createSimpleThing();
		second_thing.operation();
		
		IThing third_thing = simpleFactory.createMoreComplexThing();
		third_thing.operation();
		
		IThing fourth_thing = complexFactory.createMoreComplexThing();
		fourth_thing.operation();
		
		IAbstractFactory decoratedFactory = new DecoratorFactory();
		IThing fifth_thing = decoratedFactory.createSimpleThing();
		fifth_thing.operation();
		
		Decorator sixth_thing = (Decorator) decoratedFactory.createMoreComplexThing();
		
		sixth_thing.child = (Decorator)fifth_thing;
		
		
	}
	
	
	
}
