public class LinkedListTest {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
        }
    }
    public void insertData(int data){
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;

    }

    public void insertdataEnd(int data){
        Node new_node = new Node(data);
        if(head == null){
            new_node.next = head;
            head = new_node;
        }
        Node last = head;
        while (last.next!=null){
                 last = last.next;
        }
        last.next = new_node;

    }

    public void append(Node prev_Node, int data){
        Node new_node = new Node(data);
        if(prev_Node == null){
            System.out.println(
                    "The given previous node cannot be null");
            return;
        }
        new_node.next = prev_Node.next;
        prev_Node.next = new_node;
    }
    public void printLinkedList(){
        Node node = head;
        while(node != null){
            System.out.println(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        LinkedListTest linkedListTest = new LinkedListTest();
        linkedListTest.insertData(3);
        linkedListTest.insertData(6);

        linkedListTest.printLinkedList();
        linkedListTest.insertdataEnd(7);
        linkedListTest.printLinkedList();

    }
}
