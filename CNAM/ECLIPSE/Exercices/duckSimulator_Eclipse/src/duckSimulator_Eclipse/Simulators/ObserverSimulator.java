package duckSimulator_Eclipse.Simulators;

import duckSimulator_Eclipse.adapter.ObservableAdapter;
import duckSimulator_Eclipse.birds.TestDuck;
import duckSimulator_Eclipse.observer.ConcreteObserver;
import duckSimulator_Eclipse.observer.Observable;
import duckSimulator_Eclipse.observer.Observer;
import old.MallardDuck;

public class ObserverSimulator extends ASimulator {

	@Override
	public void baseSimulate() {
		// TODO Auto-generated method stub
	
		ObservableSimulate();
		ObservableAdapterSimulate();		
	}
	
	/**Simulate simple observable.
	 * 
	 */
	public void ObservableSimulate()
	{
		//One observable
		Observable bird = new TestDuck();
		//One observer
		Observer quackologist = new ConcreteObserver();
		//Attach the observer to the observable
		bird.attach(quackologist);
		//Do the observed action.
		bird.quack();
		bird.quack();
		bird.quack();
	}
	
	/**Simulate ObservableAdapter
	 * 
	 */
	public void ObservableAdapterSimulate()
	{
		//One Observable adapter
		ObservableAdapter birdAdapter = new ObservableAdapter(new MallardDuck());
		//One observer
		Observer quackologist = new ConcreteObserver();
		//Attach the observer to the observable adapter
		birdAdapter.attach(quackologist);
		//Do the observed action.
		birdAdapter.quack();
		birdAdapter.quack();
		birdAdapter.quack();
		
	}

	@Override
	public void decoratorSimulate() {
		// TODO Auto-generated method stub
		
	}

}
