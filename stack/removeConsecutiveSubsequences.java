import java.util.Stack;

public class removeConsecutiveSubsequences {

    static int [] remove(int []arr){
    int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<n;i++){
            if(st.isEmpty() || st.peek()!=arr[i]){
                st.push(arr[i]);
            }
            else if(st.peek() == arr[i]){
                if(i == n - 1 ||arr[i]!=arr[i+1]){
                    st.pop();
                }
            }
        }
        int k = st.size();
    int [] ans = new int[k];
        for(int i = k -1;i>=0;i--){
            ans[i] = st.pop();
        }
        return ans;
    }


    public static void main(String[] args) {
        int []arr = {1,2,2,3,10,10,10,5,7,7};
        int [] res = remove(arr);
        System.out.println("original array");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("after remove Consecutive Subsequences");
        for(int i = 0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();
    }
}
