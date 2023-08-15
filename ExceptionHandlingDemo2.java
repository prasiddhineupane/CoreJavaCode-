import java.util.Scanner;

public class ExceptionHandlingDemo2 {

    static void print(String name) throws Exception {

        if ("Prasi".equalsIgnoreCase(name)) {
            RuntimeException exception = new RuntimeException();
            throw exception;
        }
        System.out.println("Hello" + name);
        System.out.println("Welcome..... ");

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name: ");
            String name = sc.next();

            try {
                print(name);
            } catch (Exception e) {
                e.printStackTrace();
            }

    }
}
