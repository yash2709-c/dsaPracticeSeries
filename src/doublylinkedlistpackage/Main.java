package doublylinkedlistpackage;

public class Main {
    public static void main(String[] args) {
        DLList list = new DLList();
        list.createList(4);
        list.insertNode(3, 0);
        list.insertNode(2, 2);
        list.insertNode(6, 1);
        list.traversal(list.head);
    }
}
