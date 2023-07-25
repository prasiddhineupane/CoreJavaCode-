package day4assignment;
import java.util.Scanner;

public class Scannerdemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //1. WAP - print your name, age and salary using scanner.
        System.out.println("What is your name? ");
        String str = scanner.nextLine();
        System.out.println("Your name is " +str+".");

        System.out.println("What is your age? ");
        Integer age = scanner.nextInt();
        System.out.println("Your age is " +age+".");

        System.out.println("What is your Salary? ");
        Double salary = scanner.nextDouble();
        System.out.println("Your Salary is " +salary+".");

        //2. WAP - perform arithmetic operations using scanner.
        System.out.println("Input your first number: ");
        Integer a = scanner.nextInt();
        System.out.println("Input your second number: ");
        Integer b = scanner.nextInt();
        System.out.println("Thank you! We will now do arithmetic calculations with the number you provided.  ");
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        //3. WAP - perform a logical operations on int x = 12, int y = 45
        int x = 12;
        int y = 45;


        //AND && operator
        System.out.println((x<y)&&(y>x)); //True
        System.out.println((x>y)&&(y>x)); //False

        // OR || operator
        System.out.println((y<x)||(y>x)); //True
        System.out.println((x>y)||(y<x)); //False

        // NOT ! operator
        System.out.println(!(x==y)); //True
        System.out.println(!(y > x)); //False

    }
}
