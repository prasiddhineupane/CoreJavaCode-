package AssignmentJuly24;
import java.util.Scanner;
//1.Write a Java program that takes a number as input
// and prints its multiplication table upto 10.
public class tableDemo {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your number: ");
        x = sc.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.println(x + "x" + i + "=" + (x*i));

        }
    }
}

