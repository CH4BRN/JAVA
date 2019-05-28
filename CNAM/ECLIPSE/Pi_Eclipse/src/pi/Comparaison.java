package pi;

import pi.model.Pi1;
import pi.model.Pi2;
import pi.model.Pi3;

/**Comparaison class.
 * @author pierre.antoine
 *
 */
public class Comparaison {

	
	/** Program start.
	 * @param args
	 */
	public static void main(String[] args) {
				
		int value = Integer.parseInt(args[0]);
		
		System.out.println("java Comparaison " + value + "\n");
		
		System.out.println("Nombre d'itérations : " + value + "\n");
		System.out.println("Math.Pi : " + Math.PI + "\n"+ "\n");
		
		Pi1.CalculePi(value);
		System.out.println("Pi 1 \n - Value = " + Pi1.piValue 
				+ "\n - Difference : " +  (Math.PI - Pi1.piValue) + "\n");
		
		Pi2.CalculPi(value);
		System.out.println("Pi 2 \n - Value = " + Pi2.piValue 
				+ "\n - Difference : " +  (Math.PI - Pi2.piValue)+ "\n");
		
		Pi3.CalculePi(value);
		System.out.println("Pi 3 \n - Value = " + Pi3.piValue 
				+ "\n - Difference : " +  (Math.PI - Pi3.piValue)+ "\n");			 	
	}	
}
