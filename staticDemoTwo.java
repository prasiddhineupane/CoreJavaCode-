public class staticDemoTwo {

    //non static method
    void go() {
        System.out.println("I am learning static keyword!! ");

    }

    //static method
    static void display() {
        System.out.println("I am learning JAVA!! ");

    }

    public static void main(String[] args) {
        staticDemoTwo.display(); //for static method dont need to create object separately.

        staticDemoTwo dd = new staticDemoTwo(); // need to make object of that class for non static method
        dd.go();

    }
}
