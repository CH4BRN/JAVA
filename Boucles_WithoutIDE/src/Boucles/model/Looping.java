package model;
/** Class to operate loop instruction. */
public class Looping
{
	/** Loop with "for" instruction. */
	public static void NumberForLoop()
	{
		System.out.println("\t \t=== Avec for ===");
		for(int i=0;i<=20;i++)
		{
			System.out.print(i + " ");
		}
			
	}
	
	/** Loop with "do" instruction. */
	public static void NumberDoLoop()
	{
		int i = 0;
		System.out.println("\n\t \t=== Avec do ===");
		do
		{
			System.out.print(i + " ");
			i++;
		} 
		while (i <= 20);
	}
	
	/** Loop with while instruction. */
	public static void NumberWhileLoop()
	{
		int i = 0;
		System.out.println("\n\t \t=== Avec while ===");
		while( i<=20)
		{
			System.out.print(i + " ");
			i++;
		}		
	}
}
