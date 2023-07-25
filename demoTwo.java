package day5switch;

import java.util.Scanner;

//scanner class
public class demoTwo {
    public static void main(String[] args) {
        int x;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your day");
        x = sc.nextInt();
        switch (x) {
            case 1: {
                System.out.println("Monday");
                break;
            }
            case 2: {
                System.out.println("Tuesday");
                break;
            }
            case 3: {
                System.out.println("Wednesday");
                break;
            }
            case 4: {
                System.out.println("Thursday");
                break;
            }
            case 5: {
                System.out.println("Friday");
                break;
            }
            default:
                System.out.println("no match found");
                break;
        }
    }
}

