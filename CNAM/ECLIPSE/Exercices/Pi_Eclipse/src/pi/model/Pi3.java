package pi.model;

/**Pi3 class : Nilakantha formula
 * @author pierre.antoine
 *
 */
public class Pi3 {

	/** Pi value
	 * 
	 */
	public static double piValue;
	
	/** Pi calculation.
	 * @param n
	 */
	public static void CalculePi(int n)
	{
		double x, y, z = 0;
		
		for (double i = 3; i <= n; i= i + 2)
		{			
			x = i-1;
			y = i+1;
			z = z + 4/(x*i*y);			
		}
		
		piValue = z + 3 ;
	}	
	
}
