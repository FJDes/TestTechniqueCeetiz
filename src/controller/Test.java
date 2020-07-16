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
		AutoEntreprise auto = new AutoEntreprise("1234 5678 9755 9865", "BNP");
		Sas sas = new Sas("98765 43276 89986786", "Renault", "42 rue du Test");
		Entreprise fake = new Entreprise("76575", "Faker", TypeEntreprise.INCONNU);
		//Entreprise test = new Entreprise("", null, null);
		
			System.out.println(Impot.impotCalculation(100, auto));
			System.out.println(Impot.impotCalculation(100, sas));
			//System.out.println(Impot.impotCalculation(-100, auto));
			System.out.println(Impot.impotCalculation(252456, auto));
			//System.out.println(Impot.impotCalculation(100, fake));
		} catch (Throwable throwable) {
			System.out.println(throwable);
		}
	}

}
