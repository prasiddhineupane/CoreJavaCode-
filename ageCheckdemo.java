import java.util.Scanner;
public class ageCheckdemo {

    public static void main(String[] args) {
        //3. WAP to  check whether a person is eligible for vote or not.[Hint :age>18]
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age : ");
        Integer a = scanner.nextInt();
        if(a>=18){
            System.out.print("You're eligible to vote. ");
        } else {
            System.out.print("You're not eligible to vote. ");
        }
    }
}

