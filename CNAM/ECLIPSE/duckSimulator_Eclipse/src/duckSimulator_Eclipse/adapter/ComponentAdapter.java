package duckSimulator_Eclipse.adapter;

import duckSimulator_Eclipse.composite.Component;
import old.IQuackable;

public class ComponentAdapter extends Component {

	public ComponentAdapter (IQuackable bird)
	{
		this.bird = bird;
	}
	
	@Override
	public void quack()
	{
		
		bird.quack();
	}
	public IQuackable bird;
	
}
