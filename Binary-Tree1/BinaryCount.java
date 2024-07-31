public class BinaryCount {
    static class Node{
        int data;
        Node left, right;

          Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

     static int count(Node root){
        if(root == null){
            return 0;
        }

        int leftCount = count(root.left);
        int rightCount = count(root.right);

        return (leftCount + rightCount + 1);
    }

    public static void main(String [] args){
         Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);
         root.left.left = new Node(4);
         root.left.right = new Node(5);
         root.right.left = new Node(6);

         System.out.println("Number of Nodes in the Binary Tree: " + count(root));
    }
}
