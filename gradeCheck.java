
import java.util.Scanner;
public class gradeCheck {
    public static void main(String[] args) {
        //6.WAP to check for  the marks, 0-30- print fail, 31-45-print fair, 50-70 print average,
        // greater than 80=excellent
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your grade: ");
        Double grade = scanner.nextDouble();
        if (grade <= 30) {
            System.out.println(" Fail ");
        }
        if (grade > 30 && grade <= 45) {
            System.out.println(" Fair ");
        }
        if (grade >= 50 && grade <= 70) {
            System.out.println(" Average ");
        }
        if (grade <= 80) {
            System.out.println(" Excellent ");
        }
    }
}
