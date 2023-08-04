package july31object;

//2.WAP to create a class mobile with methods
// ringing() and vibrtaing() and attributes color="Red" and
// price=3456 .Access these with the help of object.
// Also use tostring() to print the values.
public class assignmentMobile {

    String color = "Red";
    int price = 3456;

    void price(){

    }

    void color(){

    }

    @Override
    public String toString() {
        return "assignmentMobile{" +
                "color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    void ringing() {
        System.out.println("Phone is ringing");

    }

    void vibrating() {
        System.out.println("Phone is vibrating");
    }



    public static void main(String[] args) {
assignmentMobile mobile = new assignmentMobile();
        System.out.println("Mobile price: " + mobile.price);
        System.out.println("Mobile color: " + mobile.color);
        mobile.ringing();
        mobile.vibrating();
    }
}
