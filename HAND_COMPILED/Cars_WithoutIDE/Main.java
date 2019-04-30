import org.graalvm.compiler.core.common.util.IntList;

/** Votre premier programme Java */
class FirstApp 
{
	public static void main (String[] args)
	{
		System.out.println("Hello World");

		
	}

	private static int[][] GetSellTab()
	{
		return new int[][]
		{
			{0,5,2,3},
			{4,6,5,0},
			{3,0,4,3},
			{6,2,0,7}
		};
	}

	private static int [] GetPricesTab()
	{
		return new int[]
		{
			20000,
			30500,
			25000,
			22400
		};
	}
}