
package general;

/**
 * If Teacher is using command-line, please also include the
 * program arguments.
 * e.g. java GenerateRandomFloatingPoint 5 10
 * 
 * If Teacher is using Eclipse, please do the following:
 * - go to Run > Run configurations.. > Arguments > Program arguments:
 * - Provide the arguments with space in between.
 * e.g. 10 19
 */
class GenerateRandomFloatingPoint {
	static double randomFloatingPoint(double low, double high) {
		return Math.random() * (high - low) + low;
	}
	
	public static void main(String[] args) {
		double x = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);
		double rand = randomFloatingPoint(x, y);
		System.out.printf("Random floating-point number is %.2f", rand);
	}
}
