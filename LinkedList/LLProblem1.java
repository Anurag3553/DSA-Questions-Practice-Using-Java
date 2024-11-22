//Add First and last in LL and print the list
public class LLProblem1 {
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
    //Add First
    public static void addfirst(int data){
        //Step 1 = Create new Node
        Node newNode = new Node(data);
        if (head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;  // NewNode-->head  ==> head<--newNode
        head = newNode;    // [2]-->[1]  ==> [2,1]
    }

    //Add Last
    public static void AddLast(int data){
        Node newNode = new Node(data);
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
    }
    public static void main(String[] args) {
        LLProblem1 ll = new LLProblem1();
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addfirst(3);
        ll.addfirst(4);
        ll.addfirst(5);
        ll.AddLast(6);
        ll.AddLast(7);
        ll.AddLast(8);
        ll.AddLast(9);
        ll.AddLast(10);
        ll.PrintLL();
    }
}
