package doublylinkedlistpackage;

public class DLList {
    public Node head;
    public Node tail;
    public int size;

    public DLList() {
        this.head = null;
        this.tail = null;
    }

    public Node createList(int value) {
        head = new Node();
        Node newNode = new Node();
        newNode.value = value;
        newNode.next = null;
        newNode.previous = null;
        head = newNode;
        tail = newNode;
        size = 1;
        return head;
    }

    public void insertNode(int value, int position) {
        if(head == null) {
            createList(value);
            return;
        }
        Node newNode = new Node();
        newNode.value = value;
        newNode.previous = null;
        newNode.next = null;
        if(position == 0) {
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        }else if(position>=size-1) {
            newNode.next = null;
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }else{
            Node current = head;
            for(int i = 0; i< size-1;i++) {
                if(i == position -1) {
                    newNode.next = current.next;
                    current.next = newNode;
                    newNode.previous = current;
                    current.next.previous = newNode;
                }
                current = current.next;
            }
        }size++;
    }
    public void traversal(Node head) {
        while(head!=null) {
            System.out.println(head.value);
            head = head.next;
        }
    }
}
