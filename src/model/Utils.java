/**
 * 
 */
package model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author FJ
 *
 */
public class Utils {
	public static double pourcentageReduce(double value, double pourcent) {
		return (value - (value * (pourcent / 100)));
	}
	
	public static BigDecimal pourcentageReduce(BigDecimal value, BigDecimal pourcent) {
		return (value.subtract((value.multiply((pourcent.divide(BigDecimal.valueOf(100)))))));
		// (value - (value * (oourcent / 100)))
	}
	
	public static String formatNumber(Number number) {
		final NumberFormat instance = NumberFormat.getNumberInstance(Locale.FRENCH);
		instance.setMinimumFractionDigits(2);
		instance.setMaximumFractionDigits(2);
		instance.setGroupingUsed(true);
		instance.setRoundingMode(RoundingMode.HALF_UP);
		return instance.format(number);
	}
	
	public static String formatString(String str) {
		str = removeDuplicateSpace(str);
		return str;
	}
	
	private static String removeDuplicateSpace(String str) {
		return str.replaceAll("\\s+", " ").trim();
	}
}
