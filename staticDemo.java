public class staticDemo {

    // instance variable
//static is a property of a class with class name you can directly assess it
//    int a = 12;

    static int a = 12;

    int x = 89; //non static variable
    public static void main(String[] args) {

        staticDemo ss = new staticDemo();
//        System.out.println(ss.a); //no need to write this two line if we use static int a = 12;
        System.out.println(ss.x);

        System.out.println(staticDemo.a);
    }
}
