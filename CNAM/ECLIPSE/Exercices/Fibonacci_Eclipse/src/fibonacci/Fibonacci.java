package fibonacci;

import fibonacci.model.Calculation;

/** Fibonacci project main class.
 * @author pierre.antoine
 *
 */
public class Fibonacci {

	/** Proghram start.
	 * @param args
	 */
	public static void main(String[] args) {
 
		if(Integer.parseInt(args[0]) == 0)
		{
			System.out.print("Aucun argument.");
		}
		else
		{
			System.out.print("Série de Fibonacci - iteratif" + "\n");
			Calculation.DisplayIterativeFibonacci(Integer.parseInt(args[0]));
			
			System.out.print("Série de Fibonacci - recursrif" + "\n");
			Calculation.DisplayRecursiveFibonacci(10);
		}		
	}
}
