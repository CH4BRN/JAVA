package pi.model;

/**Pi2 class : Leibniz formula
 * @author pierre.antoine
 *
 */
public class Pi2 {

	/** Pi value.
	 * 
	 */
	public static double piValue = 0.00;
	
	/** Pi calculation. 
	 * @param n
	 * @return
	 */
	public static void CalculPi(int n)
	{
		boolean x = true;
		
		for ( int i = 1; i <= n; i+=2)
		{
			if ( x==false)
			{
				piValue = piValue + 4/i;
				x = true;
			}
			else
			{
				piValue = piValue - 4/i;
				x = false;
			}			
		}		
	}		
}
