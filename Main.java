
package binarytree;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Manually adding nodes to the binary tree
        tree.add(50);
        tree.add(30);
        tree.add(70);
        tree.add(20);
        tree.add(40);
        tree.add(60);
        tree.add(80);

        // Display the tree using different traversals
        System.out.print("Preorder Traversal: ");
        tree.preorderTraversal(tree.root);
        System.out.println();

        System.out.print("Inorder Traversal: ");
        tree.inorderTraversal(tree.root);
        System.out.println();

        System.out.print("Postorder Traversal: ");
        tree.postorderTraversal(tree.root);
        System.out.println();

        // Calculate and display the level of the tree
        System.out.println("Level of the tree: " + tree.calculateLevel(tree.root));

        // Check and display if the tree is full
        System.out.println("Is the tree a full binary tree? " + tree.isFullTree(tree.root));

        // Check and display if the tree satisfies the children sum property
        System.out.println("Does the tree satisfy the children sum property? " + tree.checkChildrenSumProperty(tree.root));
    }
}
