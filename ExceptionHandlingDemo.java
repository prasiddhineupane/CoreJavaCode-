import java.util.Scanner;

//try, catch, finally, throw, throws
public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String input = sc.next();

        if("Prasi".equalsIgnoreCase(input)) {
            RuntimeException exception = new RuntimeException();
            throw exception;
        }
        System.out.println("Welcome " + input);
        }
    }
