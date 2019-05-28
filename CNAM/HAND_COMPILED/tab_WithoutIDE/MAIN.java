/** Calculer moyenne, maximum et index du maximum*/
class Main 
{
	/** Program start here */
	public static void main (String[] args)
	{
		int[] numbers = new int[] {12,87,56,4,-5,18};
		int[] results = GetMaxValue(numbers);
		System.out.println("Max = " + results[0]);
		System.out.println("Index = " + results[1]);
		System.out.println("Aver = " + GetAverage(numbers));
		
	}
	/** Get max value
	return a tab with max index and max value 
	*/
	public static int[] GetMaxValue(int[] tab)
	{
		int max = Integer.MIN_VALUE;
		int index = 0;
		int maxIndex = 0;
		
		for(int i =0; i < tab.length; i++)
		{
			
			if(tab[i] > max)
			{
				max = tab[i];
				maxIndex = i;
			}	
			
		}
	
		
		int[] result = {maxIndex, max};
		return result;		
	}
	/** Get the average
	return the average */
	public static float GetAverage(int[] tab)
	{
		float avr = 0.00f;
		float sum = 0;
		float count = 0;
		for(int n : tab)
		{
			sum += n;
			count++;
		}
		return sum / count;
	}
		
}