/**
 * 
 */
package model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author FJ
 * 
 * Class which contain useful static method
 *
 */
public final class Utils {
	public static double pourcentageReduce(double value, double pourcent) {
		return (value - (value * (pourcent / 100)));
	}
	
	public static BigDecimal pourcentageReduce(BigDecimal value, BigDecimal pourcent) {
		return (value.subtract((value.multiply((pourcent.divide(BigDecimal.valueOf(100)))))));
		// (value - (value * (oourcent / 100)))
	}
	
	/**
	 * Format a number in a classic and understandable way
	 * @param number accept all type of number
	 * @return a formated str
	 */
	public static String formatNumber(Number number) {
		final NumberFormat instance = NumberFormat.getNumberInstance(Locale.FRENCH);
		instance.setMinimumFractionDigits(2);
		instance.setMaximumFractionDigits(2);
		instance.setGroupingUsed(true);
		instance.setRoundingMode(RoundingMode.HALF_UP);
		return instance.format(number);
	}
	
	/**
	 * Format a string in order to have a clean str
	 * @return a formated str
	 */
	public static String formatString(String str) {
		str = removeDuplicateSpace(str);
		return str;
	}
	
	public static String removeDuplicateSpace(String str) {
		return str.replaceAll("\\s+", " ").trim();
	}
	
	public static String removeAllSpace(String str) {
		return str.replaceAll("\\s+", "");
	}
	
	/**
	 * Checking digital suite
	 * @param str digital character only
	 * @param length determines the length that the method should check
	 * @return true if the numerical string is correctly set
	 */
	public static boolean checkNumericalFormat(String str, int length) {
		Pattern pattern = Pattern.compile("\\d{" + length + "}");
		Matcher match = pattern.matcher(str);
		return match.find();
	}
}
