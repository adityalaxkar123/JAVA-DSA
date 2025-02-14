import java.util.HashSet;

public class longestConsecutiveStreak {

    public static int longestStreak(int []a){
        HashSet<Integer> st = new HashSet<>();
        for(int i : a){
            st.add(i);
        }
        int maxLen = 0;
        for (int i : st){

            if(!st.contains(i - 1)){
                int currNum = i;
                int currStreak = 1;
                while (st.contains(currNum + 1)){
                    currStreak++;
                    currNum++;
                }
                maxLen = Math.max(currStreak,maxLen);
            }
        }

      return maxLen;
    }

    public static void main(String[] args) {
        int []a = {100,4,200,1,3,2};
        System.out.println(longestStreak(a));

    }
}
