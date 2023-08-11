

public class EmployeeEncapMain extends DemoEmployeeEncapsulation {

    public static void main(String[] args) {

        EmployeeEncapMain ee = new EmployeeEncapMain();
        System.out.println(ee.getClass());
        System.out.println(ee.getAge());
        System.out.println(ee.getName());
        System.out.println(ee.getDesignation());

        ee.setName("Preeti");
        System.out.println(ee.getName());

    }
}
