package conversion;

import conversion.model.Degres;
import conversion.utils.Format;

/** Project main class
 * @author pierre.antoine
 *
 */
public class Conversion {

	/**¨Program start.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(args.length > 0)
		{
			int value = Integer.parseInt(args[0]);
			System.out.println("Value = " + value);
			var x = Degres.fahrenheitToCelsius(value);
			System.out.println("x= " + x);
			var y = Format.uneDecimale(x);
			System.out.println("y = " + y);
			var z = String.valueOf(y);
			System.out.println(Format.uneDecimale(x));
		}
		
	}

}
