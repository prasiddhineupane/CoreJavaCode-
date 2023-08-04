//this keyword is used to distinguished between local and instance variable

public class thisEmployee {
//Creating attributes of clas
    int id;
    String name;


//    thisEmployee(int i, int n){
//        id = i;
//        name = n;
//    }
    public thisEmployee(int id, String name) { //parameterized constructor
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "thisEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    thisEmployee(){

    }
    public static void main(String[] args) {
        thisEmployee ee = new thisEmployee();
        thisEmployee ee1 = new thisEmployee (121, "Sanjay");
        System.out.println(ee);
        System.out.println(ee1);

    }
}
