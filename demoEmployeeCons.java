//Constructor don't have any return type
//It is a special method which assign initial state to the object
public class demoEmployeeCons {

//demoCons(){ //default constructor or no argument constructor
//
//}

    int age = 23;
    String name = "Prasi";
    String designation = "Developer";
    int salary = 1234;

    void typing(){

        System.out.println("I am a Programmer. ");
    }
   demoEmployeeCons(int a, int s){ //this is parameterized constructor
        age = a;
        salary = s;

   }

    demoEmployeeCons(){ //default constructor

    }


    public static void main(String[] args) {
      demoEmployeeCons ee = new demoEmployeeCons();
      demoEmployeeCons ee1 = new demoEmployeeCons();
        demoEmployeeCons ee2 = new demoEmployeeCons(24, 9876);

      ee.typing();


        System.out.println(ee.salary);
        System.out.println(ee1.salary); //same output will come so we need constructor
        System.out.println(ee1.age);
        System.out.println(".................");
        System.out.println(ee2.age);
        System.out.println(ee2.salary);




        }
    }
