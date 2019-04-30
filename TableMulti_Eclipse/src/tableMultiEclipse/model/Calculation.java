package tableMultiEclipse.model;

/**Calculation class
 * @author pierre.antoine
 *
 */
public class Calculation {
	
	/** Calculate the multiplication table.
	 * 
	 */
	public static void Calculate()
	{
		String table = "";
		
		for (int i = 0; i <= 10; i++)
		{
			for ( int j =0; j <= 10; j++)
			{
				int a = i * j;
				table = table + a + "\t";
			}
			table = table + "\n";
		}
		
		System.out.print(table);
	}
	
		

}
