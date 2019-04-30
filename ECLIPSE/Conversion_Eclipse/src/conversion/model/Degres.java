package conversion.model;

/** Conversion class.
 * @author pierre.antoine
 *
 */
public class Degres {
	
	/**Fahrenheit to Celsius conversion.
	 * @param f
	 * @return
	 */
	public static float fahrenheitToCelsius(int f)
	{
		double x = (double)0;
		double y = f-32;
		x = (5d/9d)*y;
		return (float)x;
	}

}
