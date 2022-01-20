package newBSTSeries;

import java.util.LinkedList;
import java.util.Queue;

public class BSTree {
    public BSNode root;

    public BSTree() {
        this.root = null;
    }

    private BSNode insert(BSNode currentNode, int value) {
        if(currentNode == null) {
            BSNode newNode = new BSNode();
            newNode.value = value;
//            System.out.println("The Value is successfully inserted");
            return newNode;
        } else if(value <= currentNode.value) {
            currentNode.left = insert(currentNode.left, value);
            return currentNode;
        } else {
            currentNode.right = insert(currentNode.right, value);
            return currentNode;
        }
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    public void preOrder(BSNode node) {
        if(node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder((node.right));
    }

    public void inOrder(BSNode node) {
        if(node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    public void postOrder(BSNode node) {
        if(node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    public void levelOrder() {
        Queue<BSNode> queue = new LinkedList<BSNode>();
        queue.add(root);
        BSNode currentNode = new BSNode();
        while(!queue.isEmpty()) {
            currentNode = queue.remove();
            System.out.print(currentNode.value + " ");
            if(currentNode.left != null){
                queue.add(currentNode.left);
            }
            if(currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
    }

    public BSNode search(int value) {
        BSNode currentNode = new BSNode();
        currentNode = root;
        while(currentNode != null) {
            if(currentNode.value == value) {
                System.out.println("\nNode with value: "+value +" is found in the bst");
                return currentNode;
            } else if (value > currentNode.value ) {
                currentNode = currentNode.right;
            } else {
                currentNode = currentNode.left;
            }
        }
        System.out.println("\nValue Not found");
        return null;
    }

    public BSNode minNode(BSNode root) {
        if(root.left == null) {
            return root;
        } else {
            return minNode(root.left);
        }
    }

    public BSNode deleteNode(BSNode root, int value) {
        if( root == null) {
            System.out.println("Value not found in BST");
            return null;
        }
        if(value < root.value) {
            root.left = deleteNode(root.left, value);
        } else if (value > root.value) {
            root.right = deleteNode(root.right, value);
        } else {
            if(root.left != null && root.right != null) {
                BSNode temp = root;
                BSNode minNodeForRight = minNode(temp.right);
                root.value = minNodeForRight.value;
                root.right = deleteNode(root.right, minNodeForRight.value);
            } else if (root.left != null) {
                root = root.left;
            } else if (root.right != null) {
                root = root.right;
            } else {
                root = null;
            }
        }return root;
    }
}
