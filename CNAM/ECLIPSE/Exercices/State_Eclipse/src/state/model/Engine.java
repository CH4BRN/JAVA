package state.model;

/**
 * @author pierre.antoine
 *
 */
public class Engine {
	protected IState state;
	
	public void operation() {
		if (state.getClass() == ConcreteState_1.class) {
			state = new ConcreteState_2();
		}
		else
		{
			state = new ConcreteState_1();
		}
		state.operation();
	}

}
