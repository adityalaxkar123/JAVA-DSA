import java.util.*;
public class stackUsingQueue {

    public static class stack{
        Queue<Integer> st = new LinkedList<>();
        public void push1(int val){//push efficient
            st.add(val);
        }
        public int pop1(){
            for(int i = 1;i<=st.size() - 1;i++){
                st.add(st.remove());
            }
            return st.remove();
        }
        public int peek1(){
            for(int i = 1;i<= st.size() - 1;i++){
                st.add(st.remove());
            }
            int x = st.peek();
            st.add(st.remove());

            return x;
        }

        public void push2(int val){//pop efficient
            if(st.isEmpty()){
                st.add(val);
                return;
            }
            st.add(val);
            for(int i = 1;i<st.size();i++){
                st.add(st.remove());
            }

        }
        public int pop2(){
            if(st.isEmpty()){
                return -1;
            }
            return st.remove();
        }
        public int peek2(){
            if(st.isEmpty()){
                return -1;
            }
            return st.peek();
        }
        public void display(){
            for(int i = 1;i<=st.size();i++){
                int x = st.remove();
                System.out.print(" "+x);
                st.add(x);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        stack st = new stack();
        st.push2(1);
        st.push2(2);
        st.push2(3);
        st.display();
        st.pop2();
        st.display();
        System.out.println(st.peek2());
    }
}
