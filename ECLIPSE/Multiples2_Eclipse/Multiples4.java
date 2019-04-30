import java.io.DataInputStream;
import java.lang.Object;
import java.util.Scanner;

 public class Multiples4
 {
	 /**
	 Program start
	 */
	 public static void main(String[] args) 
	 {
		 boolean test = false;
		 try
		 {
			int limit = Integer.parseInt(args[0]);
			test = true;
		 }
		 catch(Exception ex)
		 {
			 test = false;
			 ex.printStackTrace();
		 }
		 finally
		 {
			 if(test)
			 {
				int limit = Integer.parseInt(args[0]);
				DisplayMultiplesWithLimit(limit);
			 }
			 else
			 {
				 System.out.println("\n\tNO ARGS\n");
			 }
		 }
		 
		 System.out.println("Multiple with numbers");
		 DisplayMultiples(new int[]{1,2,3,4,5,6,7,8}, new int[]{5,3});
		 
	 }
	 
	 /** 
	 Display 5 and 7 multiples with a limit.
	 */
	 private static void DisplayMultiplesWithLimit(int limit)
	 {
		 for ( int i =0; i <= limit; i++)
		 {
			 if(!(i%5 == 0)||(i%7 == 0))
			 {
				 continue;
			 }
			  System.out.println("i = " + i);
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