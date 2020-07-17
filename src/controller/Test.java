/**
 * 
 */
package controller;

import model.*;

/**
 * @author FJ
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			/* VALID */
			AutoEntreprise auto = new AutoEntreprise("1234 5678 9755 98", "BNP");
			Sas sas = new Sas("   1234 56   78 97    55 98   ", "Renault", "42 rue du Test");
			
			System.out.println(Utils.formatNumber(Impot.impotCalculation(100, auto)));
			System.out.println(Utils.formatNumber(Impot.impotCalculation(100, sas)));
			System.out.println(Utils.formatNumber(Impot.impotCalculation(252456, auto)));
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		} finally {
			try {
				/* UNVALID */
				//Entreprise fake = new Entreprise("76575", "Faker", TypeEntreprise.INCONNU);
				//Entreprise test = new Entreprise("", null, null);
				

				//System.out.println(Utils.formatNumber(Impot.impotCalculation(-100, auto)));
				//System.out.println(Utils.formatNumber(Impot.impotCalculation(100, fake));
			} catch (Throwable throwable) {
				throwable.printStackTrace();
			}
		}
	}

}
