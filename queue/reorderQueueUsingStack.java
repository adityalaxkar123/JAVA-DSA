import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reorderQueueUsingStack {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        Stack<Integer> st = new Stack<>();
        System.out.println("original queue: "+q);
        // take the 1st half
        int x = q.size()/2;
        while (st.size() !=x ){
            st.push(q.remove());
        }
        //empty the stack
        while (!st.isEmpty()){
            q.add(st.pop());
        }
        //take the 1st half which is second in original queue
        while (st.size() != x){
            st.push(q.remove());
        }
        // do pairing
        while (!st.isEmpty()){
            q.add(st.pop());
            q.add(q.remove());
        }
        // reverse the queue
        while (!q.isEmpty()){
            st.push(q.remove());
        }
        while (!st.isEmpty()){
            q.add(st.pop());
        }
        System.out.println("resultant reorder queue :"+q);
    }
}
