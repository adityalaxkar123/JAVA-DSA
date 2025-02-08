import java.util.*;

public class dequeSTL {

    public static void main(String[] args) {
        Deque<Integer> st = new ArrayDeque<>();
        st.addLast(1);
        st.addLast(2);
        st.addLast(3);
        st.addLast(4);
        System.out.println(st);
        st.addFirst(5);
        System.out.println(st);
        st.removeLast();
        System.out.println(st);
        st.removeFirst();
        System.out.println(st);
        System.out.println(st.peekFirst());
        System.out.println(st.peekLast());
    }
}
