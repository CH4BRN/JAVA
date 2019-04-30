package conversion.model;

import org.junit.Test;

/** Tests for Degres class
 * @author pierre.antoine
 *
 */
public class DegresTest {
	
	/**The maximum delta between expected and actual for which both numbers are still considered equal.
	 * 
	 */
	private static final double DELTA = 1e-15;


	/**Testing FahrenheitToCelsius conversion method.
	 * 
	 */
	@Test
	public void testFahrenheitToCelsius() {
		org.junit.Assert.assertEquals(26.66666603088379, Degres.fahrenheitToCelsius(80), DELTA);
	}

}
