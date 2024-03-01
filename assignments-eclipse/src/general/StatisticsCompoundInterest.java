 package general;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * StatisticsCompundInterest.java uses 
 * - formula() method from GeneralUtilities.java , 
 * 
 * If Teacher is manually compiling using command-line, please
 * also compile these classes.
 * 
 * If Teacher is using Eclipse, it will automatically compile
 * them for you when you click "Run".
 */

class StatisticsCompoundInterest {
	static HashMap<Character, String> termsMap = new HashMap<>();
	static {
		termsMap.put('A', "total amount after n years");
		termsMap.put('P', "principal (original value)");
		termsMap.put('r', "rate of interest per year");
		termsMap.put('n', "number of years the money is invested");
	}
	static HashMap<Character, Double> terms = new HashMap<>();

	public static void main(String[] args) {
		System.out.println("\tCOMPOUND INTEREST CALCULATOR\n");	

		Scanner sc = new Scanner(System.in);
		GeneralUtilities.formula("A = P (1 + r / 100)^n", termsMap);

		for (Map.Entry<Character, String> entry : termsMap.entrySet()) {
			Character c = entry.getKey();
			
			if (c != 'A') {
				System.out.print("\tenter " + entry.getKey() + ": ");
				terms.put(entry.getKey(), sc.nextDouble());
			} else continue;
		}
		
		System.out.printf("\nTotal amount after %.1f years = %.4f\n", terms.get('n'), calculate(terms));
		sc.close();
	}
	
	static double calculate(HashMap<Character, Double> terms) {
		return terms.get('P') * Math.pow(1 + (terms.get('r') / 100), terms.get('n'));
	}
}