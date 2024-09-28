package linkedList;

import static java.lang.Integer.MIN_VALUE;

/*1 3 2 5 6 2*/ // ans = 9
public class twinSumLinkedList {

    public static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
        public Node(){

        }
    }

    public static Node reverse(Node head){
        Node curr = head;
        Node after = head;
        Node prev = null;
        while (after!=null){
            after = after.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }


    public static int twinSum(Node head){
        Node fast = head;
        Node slow = head;
        if(head.next == null) return head.val;

        while (fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node temp = reverse(slow.next);
        slow.next = temp;
        Node p1 = head;
        Node p2 = slow.next;
        int ans = MIN_VALUE;
        while (p2!=null){
            if(p1.val + p2.val > ans) ans = p1.val + p2.val;
            p1 = p1.next;
            p2 = p2.next;
        }
    return ans;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(3);
        Node c = new Node(2);
        Node d = new Node(9);
        Node e = new Node(6);
        Node f = new Node(2);
        a.next = b;
        b.next =c;
        c.next =d;
        d.next = e;
        e.next =f;

        System.out.println(twinSum(a));
    }
}
