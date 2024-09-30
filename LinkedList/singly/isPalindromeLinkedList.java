package LinkedList.singly;

public class isPalindromeLinkedList {

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
        while(after!=null){
            after = curr.next;
            curr.next =prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }

    public static boolean isPalindrome(Node head){
        Node fast = head;
        Node slow = head;
        if(head == null || head.next == null) return true;

        while (fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast = fast.next.next;
        }
        Node temp = reverse(slow.next);
        slow.next = temp;
        Node p2 = slow.next;
        Node p1 = head;
        while (p2!=null){
            if(p1.val!=p2.val) return false;
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(10);
        Node c = new Node(15);
        Node d = new Node(15);
        Node e = new Node(10);
        Node f = new Node(15);

        a.next =b;
        b.next =c;
        c.next =d;
        d.next =e;
        e.next =f;
        System.out.println(isPalindrome(a));

    }
}
