public class DeleteBST {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    // INSERT
    public static Node insert(Node root, int val) {
        if (root == null) {
            // create new node
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    // INORDER TRAVERSAL
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // DELETE
    public static Node delete(Node root, int val) {
        if (root == null) {
            return null;
        }

        // search
        if (root.data < val) {
            root.right = delete(root.right, val);
        } else if (root.data > val) {
            root.left = delete(root.left, val);
        } else {
            // voila - we found the node to be deleted
            // CASE 1: Leaf Node (no children)
            if (root.left == null && root.right == null) {
                return null;
            }

            // CASE 2: One Child (either left or right node)
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // CASE 3: Both Children (Not NULL)
            // Step 1: Find the Inorder Successor (smallest in the right subtree)
            Node IS = findInorderSuccessor(root.right);
            // Step 2: Replace the data of the node to be deleted with the Inorder Successor's data
            root.data = IS.data;
            // Step 3: Delete the Inorder Successor node
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    // FIND INORDER SUCCESSOR
    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // MAIN
    public static void main(String[] args) {
        int[] values = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();

        // TEST CASE 1 -- case 1 : leaf node  
        root = delete(root, 1);
        System.out.println("After deleting 1:");
        inorder(root);
        System.out.println();

        // TEST CASE 2 -- case 2 : one child
        root = delete(root, 10);
        System.out.println("After deleting 10:");
        inorder(root);
        System.out.println();

        // TEST CASE 3 -- case 3 : both children
        root = delete(root, 5);
        System.out.println("After deleting 5:");
        inorder(root);
        System.out.println();
    }
}
