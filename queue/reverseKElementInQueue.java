import java.util.*;
public class reverseKElementInQueue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> st = new LinkedList<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
        st.add(5);
        System.out.println("Enter the k steps");
        int k = sc.nextInt();
        Stack<Integer> gt = new Stack<>();
        System.out.println("original queue : "+st);
        while (st.size() != k - 1){
            gt.push(st.remove());
        }
        while (!gt.isEmpty()){
            st.add(gt.pop());
        }
        for(int i = 1;i<=st.size() - k;i++){
            int val = st.remove();
            st.add(val);
        }
        System.out.println("queue after reverse k steps is :"+st);
//        System.out.println(st.remove());
    }
}
