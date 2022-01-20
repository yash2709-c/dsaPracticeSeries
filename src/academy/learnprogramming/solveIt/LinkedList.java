package academy.learnprogramming.solveIt;

public class LinkedList {
    public NewNode head;
    public NewNode tail;
    public int size;

    public void createLL(int nodeValue) {
        NewNode newNode = new NewNode();
        newNode.value = nodeValue;
        newNode.next = null;
        head = newNode;
        tail = newNode;
        size = 1;
    }

    public void insertNode(int nodeValue) {
        if(head == null) {
            createLL(nodeValue);
            return;
        }
        NewNode newNode = new NewNode();
        newNode.value = nodeValue;
        tail.next = newNode;
        newNode.next = null;
        tail = newNode;
        size++;
    }

    public void traversalLL() {
        NewNode tempNode = head;
        for(int i = 0; i < size; i++) {
            System.out.print(tempNode.value);
            if(i != size - 1) {
                System.out.print("-->");
            }
            tempNode = tempNode.next;
        }
        System.out.println("\n");
    }
}
