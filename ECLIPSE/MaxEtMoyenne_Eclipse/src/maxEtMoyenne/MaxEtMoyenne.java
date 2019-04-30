package maxEtMoyenne;

import model.Calculation;

public class MaxEtMoyenne {
static int[] values;
	/** Program start
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		values = new int[] {12, 87, 56, 4, -5, 18};
			
		System.out.println(Calculation.FindMax(values));
		
		Calculation.FindMaxAndIndex(values);
		
		System.out.println("Max = " + Calculation.max + " \nIndex = " + Calculation.index);
		
		Calculation.FindAverage(values);
		
		System.out.println("Average = " + Calculation.average);
		
		
	}
	
	

}
