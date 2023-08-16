import java.util.*;

public class HashMapDemo2 {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Prasi" , 10);
        map.put("Preeti" , 15);
        map.put("Shivam" , 15);
        //Iteration in HashMap
        // for(int val: arr)



        //Iteration through entry set and key set
        //e has full pairs of key and value

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey()); //prints key
            System.out.println(e.getValue()); //prints value
        }

        //Set for the keys
        Set<String> keys = map.keySet();
        for(String key: keys)
        System.out.println(key + " " +map.get(key));
    }
}
