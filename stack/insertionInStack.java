import java.util.Stack;

public class insertionInStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        int idx = 2;
        int num = 6;
        Stack<Integer> rt = new Stack<>();
        while(st.size() > 2){
            rt.push(st.pop());
        }
        st.push(num);
        while (rt.size() > 0){
            st.push(rt.pop());
        }
        System.out.println(st);
    }
}
