import java.util.HashMap;

public class MapInterface {

    public static void main(String[] args) {
        HashMap<Integer , String> mp = new HashMap<>();
        mp.put(1,"aditya");
        mp.put(2,"laxkar");
        mp.put(3,"sohan");
        System.out.println(mp);
        System.out.println(mp.get(2));
        System.out.println(mp.containsKey(1));
        System.out.println(mp.containsValue("sohan"));
        mp.put(1,"priya"); // overrides previous one
        System.out.println(mp);
        mp.putIfAbsent(2,"rohan");// if 2 exist then rohan not filled
        System.out.println(mp);
        System.out.println(mp.entrySet());
        System.out.println(mp.keySet());
        System.out.println(mp.values());

        //iterating over keys
        for (Integer i : mp.keySet()){
            System.out.print(" "+i);
        }
        System.out.println();
        //iterating over Value
//        for (String i : mp.values())
        for (var i : mp.values()){
            System.out.print(" "+i);
        }
        System.out.println();

        //iterating over key,value mapping
        for (var i : mp.entrySet()){
//            System.out.print(" "+i.getValue());
//            System.out.println(" "+i.getKey());
            System.out.println(" "+i);
        }


        System.out.println();

    }
}
