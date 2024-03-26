package general;

/**
 * If Teacher is using command-line, please also include the
 * program arguments.
 * e.g. java RemoveAlternateCharacters abcdef
 * 
 * If Teacher is using Eclipse, please do the following:
 * - go to Run > Run configurations.. > Arguments > Program arguments:
 * - Provide the arguments with space in between.
 * e.g. abcdef
 */
class RemoveAlternateCharacters {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Provide a string as program arguement!");
        } else if (args.length > 1) {
            System.out.println("Only one string can be provided!");
        } else {
            String str = args[0];
            System.out.println(removeAlt(str));
        }
    }

    static String removeAlt(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) newStr += str.charAt(i);
        }
        return newStr;
    }
}
