package newBSTSeries;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        BSTree newTree = new BSTree();

        newTree.insert(70);
        newTree.insert(50);
        newTree.insert(90);
        newTree.insert(30);
        newTree.insert(60);
        newTree.insert(80);
        newTree.insert(100);
        newTree.insert(20);
        newTree.insert(40);
        newTree.insert(85);
        System.out.println(newTree.root == null);
//        System.out.println(newTree.root.right.value);

        newTree.inOrder(newTree.root);
        System.out.println();
        newTree.preOrder(newTree.root);
        System.out.println();
         newTree.postOrder(newTree.root);
        System.out.println();
        newTree.levelOrder();

        newTree.search(12);

//        System.out.println(newTree.minNode(newTree.root.right).value);
//        System.out.println(newTree.deleteNode(newTree.root, 70).value);
//        newTree.levelOrder();
        List<Integer> myArray = new ArrayList<>();
        myArray.add(2);
        myArray.add(1);
        myArray.add(3);
        myArray.add(5);
        myArray.add(9);
//        System.out.println(reverseArray(myArray));
    }

//    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
//        // Write your code here
//
//    }
}
