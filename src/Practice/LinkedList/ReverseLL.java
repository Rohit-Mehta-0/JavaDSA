package Practice.LinkedList;



public class ReverseLL {
    public static void main(String[] args) {

    }

    public static Node reverse(Node head){
        if(head == null){
            return null;
        }
        Node prev = null;
        Node curr = head;
        Node Next;
        while(curr != null){
            Next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = Next;

        }
        return prev;
    }
}
class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}
