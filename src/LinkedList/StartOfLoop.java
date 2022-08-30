package LinkedList;

public class StartOfLoop {
    static int findStart(Node head){
        boolean ContainsLoop = false;
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                ContainsLoop = true;
            }
        }

        if(ContainsLoop){
            fast = head;

            while(fast != slow){
                fast = fast.next;
                slow = slow.next;
            }
            if(slow == fast){
                return slow.data;
            }
            return -1;

        }
        else{
            return -1;
        }
    }

}
