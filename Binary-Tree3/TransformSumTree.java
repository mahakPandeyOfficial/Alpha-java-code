public class TransformSumTree {
    static class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data =  data;
            this.left = this.right = null;
        }
    }

    public static int transform(Node root){
        //base case
        if(root == null){
            return 0;
        }

        int leftChild = transform(root.left);
        int rightChild = transform(root.right);

        int data = root.data;

        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;

        root.data = newLeft + leftChild + newRight + rightChild;

        return data;
    }

    //for printing
    public static void preOrder(Node root){

        //base case
        if(root == null) return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        /*   Output in this format
                27
               /  \
              9    13
             / \   / \
            0   0 0   0
         */

         transform(root);
         preOrder(root);
    }
}
