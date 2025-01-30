import java.util.Stack;

public class stockPrice {
    static void printArray(int []arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int []arr = {100,80,60,70,60,75,85};
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int []res = new int[n];
        res[0] = 1;
        st.push(0);
        for(int i = 1;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()] < arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                res[i] = 1;
            }
            else{
                res[i] = i - st.peek();
            }
            st.push(i);
        }
        System.out.println("original array is:");
        printArray(arr);
        System.out.println("stocked price array is:");
        printArray(res);
    }
}
