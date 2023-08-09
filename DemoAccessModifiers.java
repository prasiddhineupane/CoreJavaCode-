
public class DemoAccessModifiers {

    private int x = 10; //access within same class so need getter setter method
    int y = 20; //this is default type so can access within same package
    protected int z = 30; //it can be accessed by child class in different package
    public int w = 40; //Public can access anywhere

    public static void main(String[] args) {

        DemoAccessModifiers obj = new DemoAccessModifiers();
        System.out.println(obj.x);
        System.out.println(obj.y);
        System.out.println(obj.z);
        System.out.println(obj.w);

        }
    }
