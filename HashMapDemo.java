import java.util.*;
//Data structure: we can store,manipulate and retrieve data
//fast and efficiently

//Interface: blueprint where we can't create object but reference
//because of abstract

//Collection: are one of the core frameworks of Java language.
//Group of object where it allows interface and classes to be used.

public class HashMapDemo {
    public static void main(String[] args) {
        //country, population pair

        //Hashmap prints in unordered way
        HashMap <String, Integer> map = new HashMap<>();

        //Insertion operation
        //map.put() = either inserts value or updates value
        //if it already exists.
        map.put("USA" , 130);
        map.put("China" , 150);
        map.put("Mexico" , 140);

        System.out.println(map);

        map.put("China", 180);
        System.out.println(map); //now this will update
        // the value if there's already a value.

        //Search/lookup operation = map.containskey()
        if(map.containsKey("Indonesia")){
            System.out.println("Key is present in the map!");
        } else {
            System.out.println("Key is not present in the map");
        }

        //get function gets the value from the key
        System.out.println(map.get("China")); //key exist
        System.out.println(map.get("Indonesia")); //key doesn't exist so prints null

        //iteration in hashmap example: for(int value : collection)
        //directly gets value rather than the index.

        int arr[] = {2,7,8,9};
        //Type one of for loop
        for(int i = 0; i<4; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();

        //Type two of for loop
        for(int val: arr){
            System.out.println(val + " ");
        }
        System.out.println();

        // Iteration in Hashmap = for(int val: arr)
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey()); //prints key
            System.out.println(e.getValue()); //prints value
        }

        //removes the key value pair of china.
        map.remove("China");
        System.out.println(map);

        }
    }
