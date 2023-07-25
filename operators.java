package day4assignment;

public class operators {

    public static void main(String[] args) {
        //WAP - print subtraction of two input
        int inputOne = 67;
        int inputTwo = 23;
        int result = inputOne-inputTwo;
        System.out.println("1. The result is = "+ result);

        //WAP - print two numbers using arithmetic operator
        int numOne = 45;
        int numTwo = 15;
        System.out.println(numOne+numTwo);
        System.out.println(numOne-numTwo);
        System.out.println(numOne*numTwo);
        System.out.println(numOne/numTwo);
        System.out.println(numOne*numTwo);

        //WAP - print increment and decrement of a number
        int num = 12;
        System.out.println(num++);
        System.out.println(++num);
        System.out.println(--num);
        System.out.println(num--);
    }
}
