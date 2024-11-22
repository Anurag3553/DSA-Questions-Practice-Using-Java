import javax.sound.midi.Soundbank;

// Remove in the list from first and last and Middle also find the size of list
public class LLProblem3 {
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
    //Add First
    public static void addfirst(int data){
        //Step 1 = Create new Node
        Node newNode = new Node(data);
        Size++;
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

    //Add-Middle in List
    public static void AddMiddle(int data, int pos){
        if (head == null){
            System.out.println("List is Empty");
            return;
        }
        Node newNode = new Node(data);
        Size++;
        Node prev = head;
        int i = 0;
        while (i < pos-2){
            prev = prev.next;
            i++;
        }
        newNode.next = prev.next;
        prev.next = newNode;
    }

    //Remove from first
    public static int removefirst(){
        if (head ==  null){
            System.out.println("ll is null");
            return -1;
        }
        int val = head.data;
        head = head.next;
        Size--;
        return val;
    }

    //Remove from last
    public static int removelast(){
        if (head == null){
            return -1;
        }
        Node temp = head;
        for (int i = 0; i<Size-2; i++){
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next = null;
        tail = temp;
        Size--;
        return val;
    }

    //Remove from Middle at any Position
    public static int removeMiddle(int pos){
        if (head == null){
            return -1;
        }
        Node prev = head;
        int i = 0;
        while (i < pos-2){
            prev = prev.next;
            i++;
        }
        int val = prev.next.data;
        prev.next = prev.next.next;
        Size--;
        return val;
    }
    public static void main(String[] args) {
        LLProblem3 ll = new LLProblem3();
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
        ll.removeMiddle(5);
        ll.PrintLL();
    }
}
