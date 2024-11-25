import java.util.Scanner;

//Find and remove Nth Node from Node
public class LLProblem7 {
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

    public static Node RemoevNth(Node head, int Key){
        if (head == null && head.next == null){
            return null;
        }
        Node prev = head;
        int i = 0;
        while (i < Key-2){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LLProblem7 ll = new LLProblem7();
        ll.AddLast(1);
        ll.AddLast(2);
        ll.AddLast(3);
        ll.AddLast(4);
        ll.AddLast(5);
        ll.RemoevNth(head, 3);
        ll.PrintLL();


    }
}
