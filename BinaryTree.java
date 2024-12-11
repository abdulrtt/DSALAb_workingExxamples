
package binarytree;

class Node {
    int data;
    Node left, right;

    // Constructor
    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class BinaryTree {
    Node root;

    // Constructor for an empty tree
    BinaryTree() {
        root = null;
    }

    // A utility method to insert a node manually (for demonstration purposes)
    public void add(int data) {
        root = addRecursive(root, data);
    }

    // Recursive function to insert a new node in the tree
    private Node addRecursive(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }

        if (data < current.data) {
            current.left = addRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = addRecursive(current.right, data);
        }

        return current;
    }

    // Preorder Traversal (Root, Left, Right)
    public void preorderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }

    // Inorder Traversal (Left, Root, Right)
    public void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.data + " ");
            inorderTraversal(node.right);
        }
    }

    // Postorder Traversal (Left, Right, Root)
    public void postorderTraversal(Node node) {
        if (node != null) {
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.data + " ");
        }
    }

    // Calculate the level (height) of the binary tree
    public int calculateLevel(Node root) {
        if (root == null)
            return 0;
        int leftHeight = calculateLevel(root.left);
        int rightHeight = calculateLevel(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    // Check if the tree is a full binary tree
    public boolean isFullTree(Node node) {
        if (node == null)
            return true;

        if ((node.left == null && node.right == null) || (node.left != null && node.right != null))
            return isFullTree(node.left) && isFullTree(node.right);

        return false;
    }

    // Check children sum property
    public boolean checkChildrenSumProperty(Node node) {
        if (node == null || (node.left == null && node.right == null))
            return true;

        int leftData = (node.left != null) ? node.left.data : 0;
        int rightData = (node.right != null) ? node.right.data : 0;

        return (node.data == leftData + rightData) &&
               checkChildrenSumProperty(node.left) &&
               checkChildrenSumProperty(node.right);
    }
}
