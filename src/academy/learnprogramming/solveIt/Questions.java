package academy.learnprogramming.solveIt;
import java.util.HashSet;

public class Questions {
    public void deleteDups(LinkedList ll) {
        HashSet<Integer> hs = new HashSet<>();
        NewNode current = ll.head;
        NewNode prev = null;
        while(current != null) {
            int curval = current.value;
            if(hs.contains(curval)) {
                prev.next = current.next;
                ll.size--;
            }else {
                hs.add(curval);
                prev = current;
            }
            current = current.next;
        }
    }

    public NewNode nthToLast(LinkedList ll, int n) {
        NewNode p1 = ll.head;
        NewNode p2 = ll.head;

        for(int i = 0; i<n; i++) {
            if(p2 == null) return null;
            p2 = p2.next;
        }
        while(p2!=null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        return p1;
    }

    public LinkedList partition(LinkedList ll, int x) {
        NewNode currentNode = ll.head;
        ll.tail = ll.head;
        while(currentNode!=null) {
            NewNode next = currentNode.next;
            int curValue = currentNode.value;
            if(curValue<x) {
                currentNode.next = ll.head;
                ll.head = currentNode;
            }else{
                ll.tail.next = currentNode;
                ll.tail = currentNode;
            }
            currentNode = next;
        }
        ll.tail.next = null;
        return ll;
    }

    public LinkedList sumsList(LinkedList list1, LinkedList list2) {
        NewNode node1 = list1.head;
        NewNode node2 = list2.head;
        int carry = 0;
        LinkedList resultLL = new LinkedList();
        while((node1 != null || node2 != null)) {
            int result = carry;
            if(node1 != null) {
                result+=node1.value;
                node1 = node1.next;
            }
            if(node2 != null) {
                result+=node2.value;
                node2 = node2.next;
            }
            resultLL.insertNode(result%10);
            carry = result / 10;
        }
        return resultLL;
    }

    public NewNode getKthNode(NewNode head, int k) {
        NewNode current = head;
        while(k>0 && current != null) {
            current = current.next;
            k--;
        }
        return current;
    }

    public NewNode findIntersection(LinkedList l1, LinkedList l2) {
        if(l1.head == null || l2.head == null) return null;
        if(l1.tail != l2.tail) return null;
        NewNode longer = new NewNode();
        NewNode shorter = new NewNode();
        if(l1.size > l2.size) {
            longer = l1.head;
            shorter = l2.head;
        }
        if(l2.size> l1.size) {
            longer = l2.head;
            shorter = l1.head;
        }

        longer = getKthNode(longer, Math.abs(l1.size - l2.size));
        while(shorter != null) {
            if(shorter != longer) {
                shorter = shorter.next;
                longer = longer.next;
            }
        }
        return longer;
    }

    public void addSameNode(LinkedList l1, LinkedList l2, int nodeValue) {
        NewNode sameNode = new NewNode();
        sameNode.value = nodeValue;
        l1.tail.next = sameNode;
        l1.tail = sameNode;
        l2.tail.next = sameNode;
        l2.tail = sameNode;
    }
}
