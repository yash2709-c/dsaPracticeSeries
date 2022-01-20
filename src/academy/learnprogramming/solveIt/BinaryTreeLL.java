package academy.learnprogramming.solveIt;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL {
    public BinaryNode root;

    public BinaryTreeLL() {
        this.root = null;
    }

    public void preOrder(BinaryNode node) {
        if(node == null) {
            return;
        }
        System.out.print(node.value + " -->");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(BinaryNode node) {
        if(node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " -->");
        inOrder(node.right);
    }

    public void postOrder(BinaryNode node) {
        if(node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " -->");
    }

    public void levelOrder() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.value + " ");
            if(presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if(presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }
    }

    public int search(String value) {
        if(root == null) {
            System.out.println("tree is empty");
            return -1;
        }
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if(presentNode.value.equals(value)) {
                System.out.println( value +" found in the tree");
                return 0;
            }else {
                if(presentNode.left != null) {
                    queue.add(presentNode.left);
                }
                if(presentNode.right != null) {
                    queue.add(presentNode.right);
                }
            }
        }
        System.out.println("Value was not found");
        return -1;
    }

    public void insert(String nodeValue) {
        BinaryNode newNode = new BinaryNode();
        newNode.value = nodeValue;
        if(root == null) {
            root = newNode;
            System.out.println("Inserted first Node at the root");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if(presentNode.left == null) {
                presentNode.left = newNode;
                System.out.println("Value added successfully");
                return;
            }else {
                queue.add(presentNode.left);
            }
            if(presentNode.left == null) {
                presentNode.left = newNode;
                System.out.println("Value added successfully");
                return;
            }else {
                queue.add(presentNode.right);
            }
        }
    }

    public BinaryNode deepestNode() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode presentNode = null;
        while(!queue.isEmpty()) {
            presentNode = queue.remove();
            if(presentNode.left!=null){
                queue.add(presentNode.left);
            }
            if(presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }
        return presentNode;
    }

    public void deleteDeepestNode() {
         Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
         queue.add(root);
         BinaryNode presentNode= null;
         BinaryNode previousNode = null;
        while(!queue.isEmpty()) {
            previousNode = presentNode;
            presentNode = queue.remove();
            if(presentNode.left == null) {
                previousNode.right = null;
                return;
            } else if(presentNode.right == null) {
                previousNode.left = null;
                return;
            }
            queue.add(presentNode.left);
            queue.add(presentNode.right);
         }
    }

//    public void delete(String value) {
//        BinaryNode currentNode = new BinaryNode();
//        currentNode.value = value;
//        if(search(value) == -1){
//            System.out.println("Value doesnt exist in the tree");
//            return;
//        }else{
//
//        }
//    }
}
