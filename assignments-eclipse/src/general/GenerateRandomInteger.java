
package general;

/**
 * If Teacher is using command-line, please also include the
 * program arguments.
 * e.g. java GenerateRandomInteger 5 10
 * 
 * If Teacher is using Eclipse, please do the following:
 * - go to Run > Run configurations.. > Arguments > Program arguments:
 * - Provide the arguments with space in between.
 * e.g. 10 19
 */
class GenerateRandomInteger {
	static int randomInteger(int low, int high) {
		return (int)(Math.round(Math.random() * (high - low) + low));
	}
	
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int rand = randomInteger(x, y);
		System.out.println("Random integer is " + rand);
	}
}
