import java.util.Scanner;

public class LLProblem8 {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int Size;
    //Add Last
    public static void AddLast(int data){
        Node newNode = new Node(data);
        Size++;
        if (head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    //Print LinkedList
    public static void PrintLL(){
        if (head == null){
            System.out.println("Ll Is Empty");
            return;
        }
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println("The Size of LinkedList is : "+Size);
    }


    public static Node midhalf(Node head){
        if (head == null && head.next == null){
            return null;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static boolean isPalindrom(){
        if (head == null && head.next == null){
            return true;
        }
        Node mid = midhalf(head);
        Node prev = null;
        Node curr = mid;
        Node next;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        while (right != null){
            if (left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LLProblem8 ll = new LLProblem8();
        ll.AddLast(1);
        ll.AddLast(3);
        ll.AddLast(3);
        ll.AddLast(3);
        ll.AddLast(1);
        ll.PrintLL();
        System.out.println(ll.isPalindrom());
    }
}
