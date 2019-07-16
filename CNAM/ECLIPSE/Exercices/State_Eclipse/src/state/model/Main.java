package state.model;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Engine engin = new Engine();
		engin.state = new ConcreteState_1();
		
		engin.operation();
		engin.operation();
		engin.operation();
		engin.operation();
		
	}

}
