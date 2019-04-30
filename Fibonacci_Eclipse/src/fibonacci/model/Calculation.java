package fibonacci.model;

import java.util.List;

/**Calculation class.
 * @author pierre.antoine
 *
 */
public class Calculation {
	/**Calculates Fibonacci continuation with iterative algorithm.
	 * @param n
	 * @return
	 */
	private static void IterativeFibonacci(int n) {
		int u = 0;
		int v = 1;
		int t;	
		
		if ( n < 2)
			System.out.print(n + "\n");
						
		for (int i = 0 ; i <= n; i++)
		{
			t = u + v;
			u = v;
			v = t;

			System.out.print( i + " = " + v + "\n");
		}		
	}
	
	/**Calculates Fibonacci continuation with recurisve algorithm.
	 * @param n
	 * @return
	 */
	private static int RecursiveFibonacci(int n) {
		if(n < 1) {
			
			return 1;
		}
		else
		{
			return (RecursiveFibonacci(n-2) + RecursiveFibonacci(n-1));			
		}		
	}
	
	/** Display Recursive calculation.
	 * @param n
	 */
	public static void DisplayRecursiveFibonacci(int n)
	{
		for(int i = 0; i <= n; i++)
		{
			System.out.println(i + " = " + RecursiveFibonacci(i));
		}		
	}
	
	/** Display Iterative calculation.
	 * @param n
	 */
	public static void DisplayIterativeFibonacci(int n)
	{
		IterativeFibonacci(n);
	}

}
