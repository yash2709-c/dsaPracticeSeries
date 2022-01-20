package academy.learnprogramming.solveIt;

public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;


    public Node createSinglyLinkedList(int nodeValue) {
        Node node = new Node(nodeValue);
        head = node;
        tail = node;
        size = 1;
        return head;
    }
    public void insertNodeBegin(int nodeValue, int location) {
        Node new_node = new Node(nodeValue);
        if (head == null){
            createSinglyLinkedList(nodeValue);
        }else if (location == 0){
            new_node.next = head;
            head = new_node;
        }else if (location >= size) {
            tail.next = new_node;
            tail = new_node;
        }else {
            Node tempNode = head;
            for(int i = 0; i < size - 1; i++){
                if(i == location - 1 ) {
                    new_node.next = tempNode.next;
                    tempNode.next = new_node;
                }
                tempNode = tempNode.next;
            }
        }
        size++;
    }
    public String printList(){
        StringBuilder a = new StringBuilder();

        Node tempNode = head;
        for(int i = 1; i <= size; i++){
            a.append(tempNode.value);
            a.append("-->");
            tempNode = tempNode.next;
        }
        return a.toString();
    }
}
