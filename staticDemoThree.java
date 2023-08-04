public class staticDemoThree {

    static int x = 12;

    static {   //static block
        System.out.println("I am learning JAVA!! ");
        System.out.println("x = " + x);
        x++;
        System.out.println(x);
    }

    static void show() {
        System.out.println("Show is a static method");

    }


}
