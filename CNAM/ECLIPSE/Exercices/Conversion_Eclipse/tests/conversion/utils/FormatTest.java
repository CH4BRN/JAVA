package conversion.utils;

import org.junit.Test;

/** Tests for Format class.
 * @author pierre.antoine
 *
 */
public class FormatTest {
	/**The maximum delta between expected and actual for which both numbers are still considered equal.
	 * 
	 */
	private static final double DELTA = 1e-15;


	/**Testing uneDecimale method.
	 * 
	 */
	@Test
	public void testUneDecimale() {
		float x = 26.66666603088379f;
		float xFormated = Format.uneDecimale(x);
		org.junit.Assert.assertEquals(26.7f, xFormated, DELTA);
	}

}
