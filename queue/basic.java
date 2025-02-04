import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class basic {

    public static void main(String[] args) {
//        Queue<Integer> q = new ArrayDeque<>();//array declaration of Queue
        Queue<Integer> q = new LinkedList<>();//LinkedList representation of Queue
        q.add(1);//to add element
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
//        System.out.println(q);
//        q.remove();//to remove element
//        System.out.println(q);
//        q.poll();// to remove element
//        System.out.println(q);
////        System.out.println(q.element());//to see top element
////        System.out.println(q.peek());//to see top element
//        System.out.println(q.size());// give's the size of queue
//        System.out.println(q.isEmpty()); // return boolean true or false if empty or not
            Queue<Integer> r  = new LinkedList<>();
        while (!q.isEmpty()) {
            System.out.print(" " + q.peek());
            r.add(q.remove());
        }
        System.out.println();
        while (!r.isEmpty()){
            q.add(r.remove());
        }
    }
}
