import java.util.ArrayList;//contains Arraylist class
import java.util.*;//contain all in-build class

public class collectionFramework {

    static void ArrayListExample(){
//        ArrayList<Integer> st = new ArrayList<>();
        LinkedList<Integer> st = new LinkedList<>();
        st.add(1); // add element
        st.add(2); // add element
        st.add(3); // add element
        System.out.println(st);//print the list
        System.out.println(st.get(1)); // 0-based indexing
        st.set(1,10);//set val 10 at index 1
        System.out.println(st);
        System.out.println(st.contains(10));// to fimd whether element exist in list or not
    }

    static void StackExample(){
        Stack<String> st = new Stack<>();
        st.push("aditya");
        st.push("laxkar");
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.isEmpty());
    }

    static void QueueExample(){
        LinkedList<Integer> st = new LinkedList<>();
        st.offer(1);
        st.offer(2);
        st.offer(3);
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.poll());
        System.out.println(st.isEmpty());
        System.out.println(st.size());
    }

    static void priorityQueue(){
        PriorityQueue<Integer> st = new PriorityQueue<>(); //default case -  min element has highest priority
//        PriorityQueue<Integer> dt = new PriorityQueue<>(Comparator.reverseOrder()); // max element got higher priority
        st.add(10);
        st.add(5);
        st.add(7);
        System.out.println(st.peek()); // 5
        System.out.println(st);// Guarantee - topmost element will be processed first
        System.out.println(st.poll()); // 5
        System.out.println(st);
        System.out.println(st.peek()); // 7

    }

    static void ArrayDequeExample(){
        // doubly ended queue
        Deque<Integer> st = new ArrayDeque<>();
        st.addFirst(1);
        st.addFirst(2);
        st.addLast(3);
        st.addLast(4);
        System.out.println(st);
        System.out.println(st.pollFirst());
        System.out.println(st.pollLast());
        System.out.println(st);
    }

    static void HashSetExample(){//unordered and unique
        HashSet<Integer> st = new HashSet<>();
        st.add(1);
        st.add(48);
        st.add(28);
        st.add(2);
        st.add(3);
        System.out.println(st);
        st.add(1);
        st.add(1);
        st.add(2);
        System.out.println(st);
        st.remove(2);
        System.out.println(st.contains(2));
        System.out.println(st.size());
    }

    static void linkedListHashset(){//ordered and unique
//        LinkedHashSet<Integer> st = new LinkedHashSet<>();
        TreeSet<Integer> st = new TreeSet<>(); // sorted and unique
        st.add(1);
        st.add(48);
        st.add(28);
        st.add(2);
        st.add(3);
        System.out.println(st);
        st.add(1);
        st.add(1);
        st.add(2);
        System.out.println(st);
        st.remove(2);
        System.out.println(st.contains(2));
        System.out.println(st.size());
    }

    public static void main(String[] args) {
//    ArrayListExample();
//        StackExample();
//        QueueExample();
//        priorityQueue();
//        ArrayDequeExample();
//        HashSetExample();
        linkedListHashset();
    }
}
