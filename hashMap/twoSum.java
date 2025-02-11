import java.util.HashMap;
import java.util.Map;

public class twoSum {

    public static int[] isExist(int []a,int target){
        Map<Integer ,Integer> mp = new HashMap<>();
        int []x = {-1,-1};
        int n = a.length;
        for (int i = 0;i<n;i++){
            int partner = target - a[i];
            if(mp.containsKey(partner)){
               x[0] = i;
               x[1] = mp.get(partner);
               return x;
            }
            mp.put(a[i],i);
        }

        return x;
    }

    public static void main(String[] args) {
        int []a = {1,5,3,2};
        int target = 5;
        int []ans = isExist(a,target);
        for (int i = 0;i<ans.length;i++){
            System.out.print(" "+ans[i]);
        }
    }
}
