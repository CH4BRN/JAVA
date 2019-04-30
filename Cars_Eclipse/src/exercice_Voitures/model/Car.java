package exercice_Voitures.model;

import java.util.Arrays;

public class Car {

	/**Sell tab
	 * 
	 */
	public static final int [][] sell = {{0,5,2,3},{4,6,5,0},{3,0,4,3},{6,2,0,7}};
	/**Prices tab.
	 * 
	 */
	public static final int [] prices = {20000, 30500, 25000, 22400};
	/**Seller tab.
	 * 
	 */
	public static final String[] seller = {"Jean", "Paul", "Jeanne", "Paule"};
	/**Models tab
	 * 
	 */
	public static final String[] models = {"2CV", "205", "R5", "404"};
	/** Tab horizontal line.
	 * 
	 */
	public static final String horizontalLine = "++--------------------------------------------------------------------------------------------------------------++";
	/** Tab horizontal line with separators.
	 * 
	 */
	public static final String horizontalLineWithSeparators = "++--------------++--------------++--------------++--------------++--------------++--------------++--------------++"; 
	/**Program start.
	 * @param args
	 */
	public static void main(String[] args) {
		
		Display();
		// TODO Auto-generated method stub

	}
	
	/**Displaying method.
	 * 
	 */
	public static void Display() {
		
		int sum = 0;
		// Declaring tab to save totals.
		int[] totals = new int[6];
		// Declaring line to display.
		String line = "||\t///\t||";
		System.out.println(horizontalLine);
		
		//First display the models names with "TOTALS" and "TURNOVER" at the end.
		{
			for(int i =0; i < models.length; i++)
			{
				line += "\t" + models[i] + "\t"+ "||" ;
			}
			line +=" TOTALS : \t|| TURNOVER : \t||";
		}
		
		// Tab design.
		System.out.println(line);
		System.out.println(horizontalLineWithSeparators);
		
		 
		for(int i =0; i< seller.length+1; i++)
		{
			
			if(i <= seller.length-1)
			{
				// Then display seller
				{
					if(seller[i].length()>=5)
					{
						line = "|| " + seller[i] + "\t||\t";
					}
					else
					{
						line = "|| " + seller[i] + "\t\t||\t";
					}
				}
				
				
				int lineSum = 0;
				int lineTurnover = 0;								
				
				// Then calculate miscellaneous totals, sum and turnover
				{
					for(int j =0; j <= sell.length-1; j++)
					{				
						line += "" + sell[i][j]+ "\t||\t";
						lineSum += sell[i][j];
						
						lineTurnover += (sell[i][j]*prices[j]);
						totals[j] += sell[i][j];
						
					}
					totals[4] += lineSum;
					totals[5] += lineTurnover;
					line += lineSum+"\t|| "+lineTurnover+" €"+"\t||";
				}
				
				// Tab design
				System.out.println(line);
				System.out.println(horizontalLineWithSeparators);
					
				
			}
			else
			{
				//At the end display totals
				line = "|| TOTALS : \t||";
				for(int j = 0; j < totals.length; j++)
				{
					if(j<totals.length-1)
					{
						line += "\t"+totals[j]+"\t"+"||";
					}
					else
					{
						line += " " + totals[j]+" €\t"+"||";
					}
				}
				
				System.out.println(line);
			}			
		}
		System.out.println(horizontalLine);
					
	}

}
