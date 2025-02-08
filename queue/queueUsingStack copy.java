import java.util.*;
public class queueUsingStack {

    public static class queue{
        Stack<Integer> st = new Stack<>();
        public void add1(int val){//push efficient
            st.push(val);
        }
        public int remove1(){
            if(st.isEmpty()){
                return -1;
            }
            Stack<Integer> gt = new Stack<>();
            while (st.size() != 1){
                gt.push(st.pop());
            }
            int x = st.pop();
            while (!gt.isEmpty()){
                st.push(gt.pop());
            }
            return x;
        }

        public int peek1(){
            if(st.isEmpty()){
                return -1;
            }
            Stack<Integer> gt = new Stack<>();
            while (st.size() != 1){
                gt.push(st.pop());
            }
            int x = st.peek();
            while (!gt.isEmpty()){
                st.push(gt.pop());
            }
            return x;
        }

        public void add2(int val){//pop efficient
            if(st.isEmpty()){
                st.push(val);
                return;
            }
            Stack<Integer> gt = new Stack<>();
            while (!st.isEmpty()){
                gt.push(st.pop());
            }
            st.push(val);
            while (!gt.isEmpty()){
                st.push(gt.pop());
            }
        }
        public int remove2(){
            if(st.isEmpty()){
                return -1;
            }
            return st.pop();
        }
        public int peek2(){
            if (st.isEmpty()){
                return -1;
            }
            return st.peek();
        }
        public void display(){
            Stack<Integer> gt = new Stack<>();
            while (!st.isEmpty()){
                gt.push(st.pop());
            }
            while (!gt.isEmpty()){
                System.out.print(" "+gt.peek());
                st.push(gt.pop());
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
    queue q = new queue();
    q.add2(1);
    q.add2(2);
    q.add2(3);
    q.add2(4);
    q.display();
    q.remove2();
    q.display();
    System.out.println(q.peek2());

    }
}
