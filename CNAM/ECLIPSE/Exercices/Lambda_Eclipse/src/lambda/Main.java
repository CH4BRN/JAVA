package lambda;

public class Main {

	public static void main(String[] args) {
		
		Runnable r = () -> System.out.println("Hello");
		// TODO Auto-generated method stub

		r.run();
		
		MathOperation addition = (a,b) -> a + b;
		MathOperation soustraction = (a,b) -> a - b;
		
		int c = 9;
		int d = 10;
		int x = addition.operation(c, d);
		int y = soustraction.operation(c,d);
		System.out.print(x);
		System.out.print(y);
	}
	
	@FunctionalInterface
	private interface MathOperation {
		int operation(int a, int b);
	}
}