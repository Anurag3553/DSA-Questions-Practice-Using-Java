import java.util.Scanner;

// Reverse a LinkedList
public class LLProblem6 {
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

    public static int RevsreLL() {
        if (head == null) {
            System.out.println("LL is Null");
            return -1;
        }
        Node prev = null;
        Node curr = head;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head.data;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LLProblem6 ll = new LLProblem6();
        ll.AddLast(1);
        ll.AddLast(2);
        ll.AddLast(3);
        ll.AddLast(4);
        ll.AddLast(5);
        ll.RevsreLL();
        ll.PrintLL();


    }
}
