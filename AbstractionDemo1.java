package abstractiondemo;
//Abstract class: limitation is you can't create the
// object of that class but you can create a reference
public abstract class AbstractionDemo1 {

    String name = "tommy";
    String color = "blue";
    int price = 100;

    //non-abstract method
    void jump(){
        System.out.println("I am an animal & I can jump!!!");

    }

    //abstract method
    abstract void findPrice();
    abstract void dance();

    //can use static method too
    static int multiply(int a, int b) {
        return a * b;
    }


}
