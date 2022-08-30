package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesUnsortedList {
    public static void main(String[] args) {

    }

    public void remove(Node head){
        Set<Integer> set = new HashSet<Integer>();
        Node prev = null;
        Node curr = head;

        while(curr != null){
            prev = curr;
            if(set.contains(curr.data)){
                prev.next = curr.next;
            }
            else{
                set.add(curr.data);
                prev = curr;
            }
            curr = curr.next;
        }

    }
}
