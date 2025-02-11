
import java.util.*;
public class basic {

    public static void main(String[] args) {
        //initialization
        Map<String , Integer> mp = new HashMap<>();
        //adding the entry in the map
        mp.put("Akash",21);
        mp.put("yash",16);
        mp.put("lav",17);
        mp.put("Rishika",19);
        mp.put("Harry",18);
        // Getting the value of a key from the hashMap
        System.out.println(mp.get("Akash")); // return the corresponding value if key exist else null
        // changing or updating the value
        mp.put("Akash",25);
        System.out.println(mp.get("Akash"));
        // remove a pair from the hashMap
        System.out.println(mp.remove("Akash"));
        // checking if key exist's in the map
        System.out.println(mp.containsKey("Akash"));
        System.out.println(mp.containsValue(17));
        // Adding a new entry only if new key doesn't exist already
        mp.putIfAbsent("yash",31);// not entered
        mp.putIfAbsent("yashika",34);
        System.out.println(mp);// to print map
        // getting all keys pairs
        System.out.println(mp.keySet());
        // getting all value pairs
        System.out.println(mp.values());
        // getting all entry of the map
        System.out.println(mp.entrySet());
        // traversing all entries of the hashMap
//        for(String key : mp.keySet()){
//            System.out.printf("age of %s is %d \n",key,mp.get(key));
//        }
//        for (Map.Entry<String , Integer> e : mp.entrySet()){
//            System.out.printf("age of %s is %d \n",e.getKey(),e.getValue()); // getKey return the key and getValue gives corresponding value
//        }
        for (var e : mp.entrySet()){
            System.out.printf("age of %s is %d \n",e.getKey(),e.getValue()); // getKey return the key and getValue gives corresponding value
        }

    }
}
