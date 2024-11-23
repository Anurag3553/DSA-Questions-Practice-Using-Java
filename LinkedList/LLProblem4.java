import java.util.Scanner;

//Search for a key in a LinkedList and return the position where it is found, if not found , return -1.
public class LLProblem4 {
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

    public static int SearchingKey(int Key){
        if (head == null){
            return -1;
        }
        Node temp =  head;
        int i = 0;
        while (temp != null){
            if (temp.data == Key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LLProblem4 ll = new LLProblem4();
        ll.AddLast(1);
        ll.AddLast(2);
        ll.AddLast(3);
        ll.AddLast(4);
        ll.AddLast(5);
        ll.AddLast(6);
        ll.AddLast(7);
        ll.AddLast(8);
        ll.AddLast(9);
        ll.AddLast(10);
        System.out.println("Enter your Key value : ");
        int Key = sc.nextInt();
        ll.PrintLL();
        int i = SearchingKey(Key);
        if (i == -1){
            System.out.println("Key value are not found : "+i);
        }else {
            System.out.println("Key Value are found at the position of :"+i);
        }
    }
}
