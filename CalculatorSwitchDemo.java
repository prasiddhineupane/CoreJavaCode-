package AssignmentJuly24;

import java.util.Scanner;
public class CalculatorSwitchDemo {

    //WAP to print a calculator if u enter 1  , it do addition ,
   // 2 it should do substraction, 3 multiplication, 4 division.

    public static void main(String[] args) {

        int choice;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 4: ");
        choice=sc.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Added your number: " + (choice+1) );
                break;
            case 2:
                System.out.println("Substracting your number: " + (choice-1))  ;
                break;
            case 3:
                System.out.println("Multiplying your number: " + (choice*2))  ;
                break;
            case 4:
                System.out.println("Dividing your number: " + (choice/2))  ;
                break;
            default:
                System.out.println("Invalid choice. Please enter a number from 1 to 4 and try again! ");
        }
    }
}
