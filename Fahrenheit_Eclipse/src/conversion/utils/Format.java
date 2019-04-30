package conversion.utils;

import java.text.DecimalFormat;

/** Format class.
 * @author pierre.antoine
 *
 */
public class Format {
	/**Decimal format to ... format.
	 * 
	 */
	private static DecimalFormat df2 = new DecimalFormat(".#");
	
	/**Formats a float
	 * @param x
	 * @return
	 */
	public static float uneDecimale(float x)
	{	
		return Float.parseFloat(df2.format(x).replace(',', '.'));
	}

}
