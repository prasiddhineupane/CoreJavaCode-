package day5switch;

public class demoOne {

    public static void main(String[] args) {
        int x = 2;
        switch (x) {
            case 1: {
                System.out.println("x is positive");
                break;
            }
            case 2: {
                System.out.println("x is negative");
                break;
            }
            case 3: {
                System.out.println("x is zero");
                break;
            }
            default: {
                System.out.println("no match found");
            }
        }
    }
}
