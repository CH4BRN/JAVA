package duck_Eclipse;

import duck_Eclipse.contracts.IAbstractFactory;
import duck_Eclipse.contracts.IDuckSimulator;
import duck_Eclipse.contracts.IQuackable;
import duck_Eclipse.decorator.ADecorator;
import duck_Eclipse.ducks.Flock;
import duck_Eclipse.ducks.MallardDuck;
import duck_Eclipse.goose.GooseAdapterA;
import duck_Eclipse.goose.GooseAdapterB;

public class DuckSimulator implements IDuckSimulator {
	private IAbstractFactory _duckFactory;
	private IAbstractFactory _countableDuckFactory;
	
	public DuckSimulator(IAbstractFactory factory, IAbstractFactory countableFactory)
	{
		_duckFactory = factory;
		_countableDuckFactory = countableFactory;
	}



    
    public void simulate(){
    	//Ducks as Quackable
    	
		IQuackable mallardDuck = this._countableDuckFactory.CreateMallardDuck();
		
		IQuackable redheadDuck = this._countableDuckFactory.CreateRedheadDuck();
		
		IQuackable duckCall = this._countableDuckFactory.CreateDuckCall();
		
		IQuackable rubberDuck = this._countableDuckFactory.CreateRubberDuck();
		
		//Goose as Auckable thanks to GooseAdapter
	IQuackable gooseAdapter = new GooseAdapterA();
		
	IQuackable gooseAdapter_2 = new GooseAdapterB();
 
		System.out.println("\n=== Duck Simulator ===");
 
		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseAdapter);
		simulate(gooseAdapter_2);	
	}
    
    public void simulatedecorator( )
    {
    	ADecorator mallardDuck = (ADecorator) _countableDuckFactory.CreateMallardDuck();
    	
    	ADecorator redheadDuck = (ADecorator) _countableDuckFactory.CreateRedheadDuck();
    	
    	ADecorator duckCall = (ADecorator) _countableDuckFactory.CreateDuckCall();

    	ADecorator rubberDuck = (ADecorator) _countableDuckFactory.CreateRubberDuck();   	
   
    	simulate(mallardDuck);
    	simulate(redheadDuck);
    	simulate(duckCall);
    	simulate(rubberDuck);
    	
    	System.out.print(ADecorator.getCount());
    	
    }
    
    public void simulateFlock()
    {
    	//[Flock 1] Whole
    	IQuackable mallardDuck = this._countableDuckFactory.CreateMallardDuck();
		IQuackable redheadDuck = this._countableDuckFactory.CreateRedheadDuck();
		IQuackable duckCall = this._countableDuckFactory.CreateDuckCall();
		IQuackable rubberDuck = this._countableDuckFactory.CreateRubberDuck();
		IQuackable goose = this._countableDuckFactory.CreateGoose();
			
		Flock f1 = new Flock();   	
    	
    	f1.add(mallardDuck);
    	f1.add(redheadDuck);
    	f1.add(duckCall);
    	f1.add(rubberDuck);
    	f1.add(goose);
    	
		//[Flock 2] Mallard
    	Flock f2 = new Flock();
    	
    	IQuackable m1 = this._countableDuckFactory.CreateMallardDuck();
    	IQuackable m2= this._countableDuckFactory.CreateMallardDuck();
    	IQuackable m3= this._countableDuckFactory.CreateMallardDuck();
    	IQuackable m4= this._countableDuckFactory.CreateMallardDuck();
    	    	
    	f2.add(m1);
    	f2.add(m2);
    	f2.add(m3);
    	f2.add(m4);
    	
    	//[Flock 3] Flock of flock
    	Flock f3 = new Flock();
    	f3.add(f1);
    	f3.add(f2);
    	
    	System.out.println("==F3 QUACK");
    	f3.quack();
    	System.out.println("==F3 count");
    	System.out.println(ADecorator.getCount());
    	System.out.println("==F2 quack");
    	f2.quack();
    	System.out.println("==F2 count");
    	System.out.println(ADecorator.getCount());
    	System.out.println("==F1 quack");
    	f1.quack();
    	System.out.println("==F1 count");
    	System.out.println(ADecorator.getCount());    	
    }
   
	public void simulate(IQuackable duck) {
		duck.quack();
	}
	
	public void simulateObserver()
	{
		MallardDuck mDuck = new MallardDuck();

	
		
	}
}
