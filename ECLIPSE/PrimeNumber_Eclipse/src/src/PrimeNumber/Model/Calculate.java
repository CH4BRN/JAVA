package PrimeNumber.Model;

public class Calculate {

	
	/**Calculate prime numbers.
	 * 
	 */
	public static void CalculatePrimeNumber()
	{		
		int i = 0;
		int count = 0;
		String primes = "";
		while(count < 50)
		{
			i++;
			if(isPremier(i))
			{
				if(count %10 ==0)
				{
					primes +="\n";
				}
				primes += i +"\t|| ";
				count++;
			}
		}
		System.out.println(primes);
	}
	
	public static boolean isPremier(int n) {
		//isPrime is setted to "false" as soon as the number is not a prime number
		boolean isPrime = true;
		
		if (n < 0) 
		{ 
			// 0 is not a prime number
			isPrime = false; 
		} 
		// for n not 0 or 1
		else if (n != 0 && n != 1) 
		{ 
			// i between 2 and n's half, as n cannot be modulo-divided by more of its half.
			for (int i = 2; i <= n/2; i++) 
			{ 
				// if i is different of n, and n modulo i is different than 0
				if (n != i && n % i == 0) 
				{ 
					isPrime = false; 
					break; 
				}
			} 
		} 
		return isPrime; 
		}
}
