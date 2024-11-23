import java.util.ArrayList;
import java.util.Scanner;

//Search for a key in a LinkedList and return the position where it is found, if not found , return -1. With help of Recursively
public class LLProblem5 {
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

    public static int Search(Node head, int Key){
        if (head == null){
            return -1;
        }
        if (head.data == Key){
            return 0;
        }
        int idx = Search(head.next, Key);
        if (idx == -1){
            return -1;
        }
        return idx+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LLProblem5 ll = new LLProblem5();
        ll.AddLast(1);
        ll.AddLast(2);
        ll.AddLast(3);
        ll.AddLast(4);
        ll.AddLast(5);
        System.out.println("Enter your Key value : ");
        int Key = sc.nextInt();
        ll.PrintLL();
        int i = Search(head,Key);
        if (i == -1){
            System.out.println("Key value are not found : "+i);
        }else {
            System.out.println("Key Value are found at the position of :"+i);
        }
    }
}
