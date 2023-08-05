public class DetectLoopLinkedList {
    Node head;
    class Node {
        Node next;
        int data;
        Node(int d){
            data = d;
        }
    }

    public void push(int data){
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }
    void detectLoop(){
        Node slow_p = head, fast_p = head;
        int flag =0;
        while (slow_p!=null & fast_p!=null & fast_p.next!=null){
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;
            if(slow_p==fast_p){
                flag = 1;
                break;
            }
        }
        if(flag==1){
            System.out.println("detect loop");
        }else {
            System.out.println("no loop");
        }
    }
    public static void main(String args[])
    {
        DetectLoopLinkedList llist = new DetectLoopLinkedList();

        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);

        /*Create loop for testing */
        llist.head.next.next.next.next = llist.head;

        llist.detectLoop();
    }
}
