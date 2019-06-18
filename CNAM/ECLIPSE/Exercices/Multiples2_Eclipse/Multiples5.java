import java.io.DataInputStream;
import java.lang.Object;
import java.util.Scanner;

 public class Multiples5
 {
	 /**
	 Program start
	 */
	 public static void main(String[] args) 
	 {
		 Scanner s = new Scanner(System.in);
		 boolean test = true;
		 System.out.println("Saisissez un nombre entier");
		 while(test)
		 {
			 try
			 {
				 DisplayMultiplesWithLimit(Integer.parseInt(s.nextLine()));
				 
				 test = false;
			 }catch(Exception e)
			 {
				 System.out.println("Saisissez un nombre entier");
				 test = true;
				 //e.printStackTrace();
			 }
		 }			 
	 }
	 
	 /** 
	 Display 5 and 7 multiples with a limit.
	 */
	 private static void DisplayMultiplesWithLimit(int limit)
	 {
		try
		{
			 for ( int i =0; i <= limit; i++)
			 {
				 if(!(i%5 == 0)||(i%7 == 0))
				 {
					 continue;
				 }
				  System.out.println("i = " + i);
			 }
		} catch(Exception e)
		{
			e.printStackTrace();
		}
	 }
			 
	 
	 
	  /** 
	 Display 5 and 7 multiples with a tab.
	 */
	 private static void DisplayMultiples(int[] numbers, int[] multiples)
	 {
		for(int n : numbers)
		{
			for(int m : multiples)
			{
				if( n % m ==0)
				{
					System.out.println("multiple = " + m + "\nnumber = " + n);
				}
			}
		}
	 }
 }