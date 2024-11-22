//Add in the Middle of ll
public class LLProblem2 {
    static class Node{
        int data;
        LLProblem1.Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static LLProblem1.Node head;
    public static LLProblem1.Node tail;
    //Add First
    public static void addfirst(int data){
        //Step 1 = Create new Node
        LLProblem1.Node newNode = new LLProblem1.Node(data);
        if (head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;  // NewNode-->head  ==> head<--newNode
        head = newNode;    // [2]-->[1]  ==> [2,1]
    }

    //Add Last
    public static void AddLast(int data){
        LLProblem1.Node newNode = new LLProblem1.Node(data);
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
        LLProblem1.Node temp = head;
        while (temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //Add-Middle in List
    public static void AddMiddle(int data, int pos){
        if (head == null){
            System.out.println("List is Empty");
            return;
        }
        LLProblem1.Node newNode = new LLProblem1.Node(data);
        LLProblem1.Node prev = head;
        int i = 0;
        while (i < pos-2){
            prev = prev.next;
            i++;
        }
        newNode.next = prev.next;
        prev.next = newNode;
    }

    public static void main(String[] args) {
        LLProblem2 ll = new LLProblem2();
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
        ll.AddMiddle(22,5);
        ll.PrintLL();
    }
}
