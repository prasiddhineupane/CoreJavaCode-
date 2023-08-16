import java.util.*;
public class ArrayListDemo {

    public static void main(String[] args) {
        List <String> list = new ArrayList<String>();
        list.add("Prasi" + " "+ "N");
        list.add("Preeti");
        list.add("Anjali");
        list.add("Sam");
        list.add("Sejal");
        list.add("Prasi");

        System.out.println(list);
        System.out.println("size is: ");
        System.out.println(list.size()); //size is 6

        //prints in ordered in nature
        //It also allows duplicate elements.

        //Three ways to iterate or traverse
        //1. For each loop, 2. for loop   3.using iterator

        System.out.println();

        System.out.println("using for each loop");

        Collections.sort(list); //default sorting

        for(String str: list){
            System.out.println(str);
        }

        System.out.println();
        System.out.println("using for loop");

        //for loop
        //list.size() gives the total num of element
        for(int j = 0; j< list.size(); j++){
            System.out.println(list.get(j));
        }

        System.out.println();
        System.out.println("Using Iterator");

        //iterator
        Iterator<String> t = list.iterator();
        while(t.hasNext()){ //if it has the next element then
            String str = t.next();
            System.out.println(str);

            System.out.println();





        }

    }
}
