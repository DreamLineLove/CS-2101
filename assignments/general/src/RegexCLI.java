import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexCLI {
    static boolean verbose = false;
    static boolean line_mode = false;
    static String pattern;
    static String file_path;
    static Pattern p;
    static File f;
    static int count = 0;

    static void parseArguments(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            boolean startsWithSingleDash = (arg.charAt(0) == '-' ? true : false) && (arg.charAt(1) == '-' ? false : true);
            
            if (startsWithSingleDash) {
                if (arg.contains("v")) verbose = true;
                if (arg.contains("l")) line_mode = true;
            } else if (arg.equals("--verbose")) {
                verbose = true;
            } else if (arg.equals("--line-mode")) {
                line_mode = true;
            } else if (arg.startsWith("--pattern=")) {
                String[] parts = arg.split("=");
                String quotedPart = parts[1];
                pattern = quotedPart.substring(0, quotedPart.length());
            } else if (arg.startsWith("--file-path")) {
                String[] parts = arg.split("=");
                String quotePart = parts[1];
                file_path = quotePart.substring(0, quotePart.length());
            }
        }
        // FOR DEBUGGING
        // System.out.println("verbose = " + verbose);
        // System.out.println("line-mode = " + line_mode);
        // System.out.println("pattern = " + pattern);
        // System.out.println("file-path = " + file_path);
    }

    static void runRegex() {
        try {
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                Matcher m = p.matcher(line);
                int inner = 0;
                if (line_mode) 
                {
                    while (m.find()) 
                    {
                        inner += 1;
                        count += 1;
                    }
                } 
                else if (verbose)
                {
                    if (m.matches()) {
                        inner = 1;
                        count += 1;
                    }
                }
                else 
                {
                    if (m.matches()) {
                        count += 1;
                    }
                }
                if (verbose) System.out.println("[" + inner + "]\t" + line + "\n");
            }
            sc.close();
        } catch (FileNotFoundException e) {
            // FOR DEBUGGING
            // e.printStackTrace();
            System.out.println("File not found!");
            System.exit(1);
        }
        System.out.println("\tNumber of matches: " + count);
    }

    public static void main(String[] args) {
        parseArguments(args);

        p = Pattern.compile(pattern);
        f = new File(file_path);

        runRegex();
    }
}
