import java.util.Stack;

public class moveStackInSameOrder {

    public static void pushAtBottom(Stack<Integer> st,int x){
        Stack<Integer> gt = new Stack<>();
        while (!st.isEmpty()){
            gt.push(st.pop());
        }
        gt.push(x);
        while (!gt.isEmpty()) {
            st.push(gt.pop());
        }
    }

    public static void reverse(Stack<Integer> st){
        if(st.size() == 1){
            return;
        }
        int top = st.pop();
        reverse(st);
        pushAtBottom(st,top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
//        Stack<Integer> rt = new Stack<>();
//        while(st.size() > 0){
//            rt.push(st.pop());
//        }
//        System.out.println(rt);
//        Stack<Integer> gt = new Stack<>();
//        while(rt.size() > 0){
//            gt.push(rt.pop());
//        }
//        System.out.println(gt);
    }
}
