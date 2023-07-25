import java.util.Scanner;
public class checknum {

    public static void main(String[] args) {
        //4. WAP to check if a num is greater that 0 it ia positive number,
        // if number is less than 0 it is a negative number else it is 0. (Take Num=0)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        Integer num = scanner.nextInt();
        if (num>0){
            System.out.println("The number you provided is a positive number. ");
        } else {
            System.out.println("The number you provided is a negative number. ");
        }
    }
}
