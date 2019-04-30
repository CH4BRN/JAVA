package pi.model;

/** Pi1 class : Euler formula
 * @author pierre.antoine
 *
 */
public class Pi1 {
	
	/** Pi value.
	 * 
	 */
	public static double piValue;
	
	/** Sum value.
	 * 
	 */
	public static double sumValue;
	
	/** Pi calculation. 
	 * @param n
	 * @return
	 */
	public static double CalculePi(int n)
	{
		for (double i = 1.00; i <= n; i++)
		{
			sumValue = sumValue + 1.00/(Math.pow(i, 2));
			
		}
		piValue = Math.sqrt(6.00*sumValue);
		return piValue;
	}	
}


