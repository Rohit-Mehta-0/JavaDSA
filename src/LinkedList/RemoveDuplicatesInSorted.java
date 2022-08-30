package LinkedList;

public class RemoveDuplicatesInSorted {
    static void remove(Node head){
        Node temp = head;
        Node prev = null;
        while(temp != null){
            prev = temp;
            temp = temp.next;

            if(prev.data == temp.data){
                prev.next = temp.next;
            }
        }
    }
}
