import java.util.Scanner;

class Ex3_8 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();
        sc.close();

        char grade = mark >= 80 ? 'A' : mark >= 70 ? 'B' : mark >= 60 ? 'C' : 'F';
        System.out.println("grade = " + grade);

    }

}
