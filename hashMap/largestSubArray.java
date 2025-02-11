import java.util.HashMap;
import java.util.Map;

public class largestSubArray {

    public static int largest(int []a){
        Map<Integer , Integer> mp = new HashMap<>();
        int n = a.length;
        int maxLength = 0;
        int prefSum = 0;
        mp.put(0,-1);
        for (int i = 0;i<n;i++){
            prefSum = prefSum + a[i];
            if(mp.containsKey(prefSum)){
                maxLength = Math.max(maxLength,i - mp.get(prefSum));
            }
            else{
                mp.put(prefSum,i);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int []a = {15,2,-2,-8,1,7,10};
        System.out.println(largest(a));
    }
}
