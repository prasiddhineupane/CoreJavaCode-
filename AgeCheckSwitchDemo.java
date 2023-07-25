package AssignmentJuly24;
//1.WAP to check whether a person is eligible for vote or not using switch.
// Take age =54 of int type - nagara esari

import java.util.Scanner;
public class AgeCheckSwitchDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you age: ");
        Integer age = scanner.nextInt();
        //int age = 54;

        switch(age) {
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
                System.out.println("Congrats! You are eligible to vote.");
                break;

            default:
                System.out.println("Not eligible to vote");
                break;

        }
    }
}
