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

    static void parseArguments() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Would you like to see results line by line? (true or false): ");
        verbose = sc.nextBoolean();

        System.out.print("Would you like to treat each word as input? (true or false): ");
        line_mode = !sc.nextBoolean();

        sc.nextLine();

        System.out.print("Enter relative file-path including file-name: ");
        file_path = sc.nextLine();

        System.out.print("Enter regex pattern to find in the file: ");
        pattern = sc.nextLine();

        sc.close();

        // FOR DEBUGGING
        System.out.println("verbose = " + verbose);
        System.out.println("line-mode = " + line_mode);
        System.out.println("pattern = " + pattern);
        System.out.println("file-path = " + file_path);
    }

    static void runRegex() {
        try {
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                Matcher m = p.matcher(line);
                int inner = 0;
                if (!line_mode && !verbose) 
                {
                    while (m.find())
                    {
                        count += 1;
                    }
                }
                else if (line_mode && verbose) 
                {
                    if (m.matches()) 
                    {
                        inner = 1;
                        count += 1;
                    }
                }
                else if (line_mode) 
                {
                    if (m.matches()) 
                    {
                        count += 1;
                    }
                }
                else if (verbose) 
                {
                    while (m.find()) 
                    {
                        inner += 1;
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
        parseArguments();

        p = Pattern.compile(pattern);
        f = new File(file_path);

        runRegex();
    }
}
