package LinkedList;

public class LInkedList {
    public static void main(String[] args) {

    }
    public void insertAtBeg(Node head, int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;

        head = newNode;
    }

    public void insertAfterGivenNode(Node head, int val, int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;

        while(temp.data != val){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void insertAtEnd(Node head, int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;

        while(temp.next !=  null){
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public void deleteNode(Node head, int data){
        if(head == null){
            return;
        }

        Node temp = head;
        while(temp != null && temp.next.data != data){
            temp = temp.next;
        }

        temp.next = temp.next.next;
    }


}




