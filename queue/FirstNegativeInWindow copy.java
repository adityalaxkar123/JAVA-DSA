import java.util.*;
public class FirstNegativeInWindow {

    public static void main(String[] args) {
        int []arr = {1,-1,2,-7,5,4,-6,4};
        int n = arr.length;
        int k = 3;
        Queue<Integer> st = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if(arr[i]<0){
                st.add(i);
            }
        }
        int []res = new int[n - k + 1];
        for (int i = 0; i < n - k + 1 ; i++) {
                if(!st.isEmpty() && st.peek()<i) st.remove();

                if(!st.isEmpty() && st.peek()<= i + k - 1){
                    res[i] = arr[st.peek()];
                } else if (st.isEmpty()) {
                    res[i] = 0;
                }
                else{
                    res[i] = 0;
                }
        }

        System.out.println("resultant array is:");
        for (int i = 0; i < n - k + 1; i++) {
            System.out.print(" "+res[i]);
        }
    }
}
