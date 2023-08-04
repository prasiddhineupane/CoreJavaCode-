
public class Student {

    //instance variable as they are created when class gets memory
    // so they are defining attributes.
    int id = 101;   //for integer it will print zero = default
    String name = "Prasi";  //for a string it will print null =default

    //defining behaviours (method)
    void run() {
        System.out.println("I can run!");
    }

    void dance() {
        System.out.println("We can dance!");
    }

    @Override
    public String toString(){
        return "Student[id=" + ", name = " + name + "]";
    }


    public static void main(String[] args) {
        Student ss = new Student();//default constructor
        ss.run();
        ss.dance();
        ss.name = "Prasi";
        System.out.println(ss.id);
        System.out.println(ss.name);
        System.out.println(ss.id + " "+ss.name);

    }
}


