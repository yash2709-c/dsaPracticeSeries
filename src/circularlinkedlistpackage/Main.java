package circularlinkedlistpackage;

public class Main {

    public static void main(String[] args) {
        CirLinkedList myCSLList = new CirLinkedList();
        myCSLList.createCSLL(5);
//        System.out.println(myCSLList.head.value);
//        System.out.println(myCSLList.head.next.value);
        myCSLList.insertNode(3, 1);
        myCSLList.insertNode(2, 2);
        myCSLList.insertNode(7, 3);
//        System.out.println(myCSLList.head == null);
        System.out.println(myCSLList.size);
        myCSLList.insertAtEnd(6);
        myCSLList.traversal(myCSLList);
    }
}
