import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        System.out.println("beforee adding" + list);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println("after adding" + list);

        //for each loop
        for (Integer i : list) {
            System.out.println(i);

        }
    }
}
