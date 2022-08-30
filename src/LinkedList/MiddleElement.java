package LinkedList;

public class MiddleElement {
    static Node findMiddle(Node head){
        if(head == null){
            return head;
        }
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    static Node findMiddleElement(Node head){
      int length =  countLength(head);
        Node temp = head;
        while(length/2 > 0){
            temp = temp.next;
        }
        return temp;
    }

    static int countLength(Node head){
        int i=0;
        if(head == null){
            return 0;
        }

        Node temp = head;

        while(temp != null){
            i++;
            temp = temp.next;
        }
        return i;
    }
}
