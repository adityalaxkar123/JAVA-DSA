import java.util.HashSet;

public class maxEleInTable {

    public static int maxStreak(int []a){
        HashSet<Integer> st = new HashSet<>();
        int maxLen = 0;
        int k = 0;
        for(int i : a){
            if(!st.isEmpty() && st.contains(i)){
                maxLen = Math.max(maxLen,k);
                k = 0;
                st.remove(i);
                continue;
            }
            else{
                st.add(i);
                k++;
            }

        }
        if(maxLen == 0){
            maxLen = k;
        }
        return maxLen;

    }

    public static void main(String[] args) {
        int []a = {1,2};
        System.out.println(maxStreak(a));

    }
}
