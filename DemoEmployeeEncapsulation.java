//Encapsulation is where we wrap the data(variables and
//method together as a single unit
//Get access outside the class for private type need to use getter setter method

public class DemoEmployeeEncapsulation {

   private int age = 20;
   private String name = "Prasi";

  private String designation = "Programmer";


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "DemoEmployeeEncapsulation{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
