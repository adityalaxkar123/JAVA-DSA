import java.util.*;

public class findMostFrequentEle {

    public static void main(String[] args) {
        Map<Integer,Integer> mp = new HashMap<>();
        int []a = {1,2,3,1,4,1};
        for(var i : a ){
            if(mp.containsKey(i)){
                int x = mp.get(i) + 1;
                mp.put(i,x);
            }
            mp.putIfAbsent(i,1);
        }
        int max = Integer.MIN_VALUE;
        for(var i : mp.entrySet()){
            if(max < i.getValue()){
                max = i.getKey();
            }
        }
        System.out.println(max);
    }
}
