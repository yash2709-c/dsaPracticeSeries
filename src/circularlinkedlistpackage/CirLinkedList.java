package circularlinkedlistpackage;

public class CirLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public CirLinkedList() {
        this.head = null;
        this.tail = null;
        System.out.println("CirLinkedList is created");
    }

    public Node createCSLL(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = node;
        head = node;
        tail = node;
        size = 1;
        System.out.println("head node added with value "+ nodeValue);
        return head;
    }

    public void insertNode(int nodeValue, int position) {
        if(head == null) {
            createCSLL(nodeValue);
            return;
        } else {
            Node newNode = new Node();
            newNode.value = nodeValue;

            if(position == 0) {
                newNode.next = head;
                head = newNode;
                tail.next = head;
            }else if(position >= size) {
                tail.next = newNode;
                tail = newNode;
                tail.next = head;
            } else {
                Node current = new Node();
                current = head;
                for(int i = 0; i < position; i++) {
                    if(i == position-1) {
                        newNode.next = current.next;
                        current.next = newNode;
                    }
                    current = current.next;
                }
            }size++;
        }
    }

    public void insertAtEnd(int value){
        if(head == null) {
            createCSLL(value);
        }else{
            Node newNode = new Node();
            newNode.value = value;
            for(int i = 1; i <=size; i++) {
                if(i == size) {
                    tail.next = newNode;
                    tail = newNode;
                    tail.next = head;
                }
            }
        }
        size++;
    }

    public void traversal(CirLinkedList list) {
        Node current = list.head;
//        int index = 1;
//        while(current.next != tail) {
//            System.out.println(current.value);
//            current = current.next;
//            index++;
//        }
//        System.out.println("**********************");
        for(int i = 0; i < list.size; i++) {
            System.out.println(current.value);
            current = current.next;
        }
    }

//    public void deleteNode(int value) {
//        Node deletedNode = new Node();
//        Node temp = head;
////        deletedNode.value = value;
//        if(head == null) {
//            System.out.println("Empti linked list");
//            return;
//        }else {
//            Node current = head;
//            for(int i = 1; i <= size; i++) {
//                if(value == current.value){
//                    deletedNode = current;
//                }
//                current = current.next;
//            }
//            if(deletedNode == head && deletedNode == tail){
//                if(size == 1){
//                    head = null;
//                    tail = null;
//                    deletedNode.next = null;
//                }else {
//                    dele;
//                    tail.next = head;
//                }
//            } else if(deletedNode == tail) {
//                Node newCurrent = temp;
//                Node previous = new Node();
//
//                for(int i = 1; i <= size; i++) {
//                    if(value == newCurrent.next.value){
//                        previous = newCurrent;
//                    }
//                    newCurrent = newCurrent.next;
//                }
//                previous.next = temp;
//                tail = previous;
//                } else {
//
//            }
        public void deleteNode(int location) {
        if(head == null) {
            System.out.println("The csll ddoesnot exist");
            return;
        }else if(location == 0) {
            head = head.next;
            tail.next = head;
            size--;
            if(size == 0) {
                tail = null;
                head.next = null;
                head = null;
            }
        } else if(location >= size) {
            Node tempNode = head;
            for(int i = 0; i<size-1; i++) {

            }
        }
    }
}
