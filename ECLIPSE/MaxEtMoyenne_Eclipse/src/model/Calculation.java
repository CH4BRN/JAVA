package model;

public class Calculation {
	/** Find the maximum in a tab
	 * @param tab
	 * @return
	 */
	
	/**Tab max value
	 * 
	 */
	public static int max;
	
	/**Tab max value index.
	 * 
	 */
	public static int index;
	
	/**Tab average.
	 * 
	 */
	public static double average = 0.00;
	
	/**Find max with "foreach"
	 * @param tab
	 * @return
	 */
	public static int FindMax(int[] tab)
	{
	int max = Integer.MIN_VALUE;
		
		for(int n : tab)
		{
			if ( n > max)
			{
				max = n;
			}
		}
		
		return max;
	}
	
	/** Find max with "for" loop.
	 * @param tab
	 */
	public static void FindMaxAndIndex(int[] tab)
	{
		for(int i = 0; i < tab.length; i++)
		{
			if(tab[i] > max)
			{
				max = tab[i];
				index = i;
			}
		}
	}
	
	/** Find tab average.
	 * @param tab
	 */
	public static void FindAverage(int[] tab)
	{
		int sum = 0;
		
		for(int i = 0; i < tab.length; i++)
		{
			sum = sum + tab[i];
		}
		
		average = (double)sum / tab.length;
	}

}
