import java.util.InputMismatchException;
import java.util.Scanner;

class AreaVolume1 {

    static String prompts[][] = {
    {
            "2D or 3D object?",
            "\t0: 2D (e.g. circle, square, ellipse)",
            "\t1: 3D (e.g. sphere, cube, cone)",
            "Your choice: ",
        },
    {
            "2D or 3D object?",
            "\t0: 2D (e.g. circle, square, ellipse)",
            "\t1: 3D (e.g. sphere, cube, cone)",
            "Your choice: ",
        },
    {
            "2D or 3D object?",
            "\t0: 2D (e.g. circle, square, ellipse)",
            "\t1: 3D (e.g. sphere, cube, cone)",
            "Your choice: ",
        },
    {
            "2D or 3D object?",
            "\t0: 2D (e.g. circle, square, ellipse)",
            "\t1: 3D (e.g. sphere, cube, cone)",
            "Your choice: ",
        },
    };
    static int dimension = -1;
    static int step = 0;

    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        
        while (step < prompts.length) {
            getValue(sc);
        }

        sc.close();
    }

    static void prompt(String prompts[]) {
        for (int i = 0; i < prompts.length; i++) {
            if (i == 0) System.out.println(prompts[i]);
            else if (i == prompts.length - 1) System.out.print("Your choice: "); 
            else System.out.println("\t" + (i-1) + prompts[i]);
        }
    }

    static void getValue(Scanner sc) {
        try {
            switch (step) {
                case 0: 
                    do {
                        prompt(prompts[0]);
                        dimension = sc.nextInt();
                    } while (dimension != 0 && dimension != 1);
                    step++;
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("\n...Input Mismatch: please try again...\n");
            sc.nextLine();
        }
    }

}
