package LinkedLists;
public class basicsll {

    public static void insertAtEnd(Node head, int val) {
        Node temp = new Node(val);
        Node t = head;
        while(t.next != null) {
            t = t.next;
        }
        t.next = temp;
    }
    public static void displayr(Node head) {
        if(head == null) return;
        //System.out.print(head.data +" ");
        displayr(head.next);
        System.out.print(head.data +" "); //print in reverse
    }
    public static void display(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static int length(Node head) {
        int count = 0;
        while(head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
    public static class Node{
        int data; //value
        Node next; // address of next node
        Node(int data) { //constructor
            this.data = data;
        }

    }
    public static void main(String[] args) {
        Node a = new Node(5); // head node
        //System.out.println(a.next); //null
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        //Node f = new Node(23);
        // 5 3 9 8 16
        a.next = b; // 5 -> 3 9 8 16
        b.next = c; // 5 -> 3 -> 9  8  16
        c.next = d; // 5 -> 3 -> 9 -> 8 16
        d.next = e; // 5 -> 3 -> 9 -> 8 -> 16
        //e.next = f;
        //System.out.println(length(a));
        insertAtEnd(a,87);

        // System.out.println(a.data);
        // System.out.println(b.data); //a.next
        // System.out.println(c.data); //a.next.next
        // System.out.println(d.data); //a.next.next.next
        // System.out.println(e.data); //a.next.next.next.next
        
        //Node temp = a;
        // for(int i=1; i<=5; i++) {
        //     System.out.print(temp.data +" ");
        //     temp = temp.next;
        // } orrrr

        // while(temp != null) { // display(print the list)
        //     System.out.print(temp.data +" ");
        //     temp = temp.next;
        // }
        display(a);
        System.out.println();
        displayr(a);
    }
}

