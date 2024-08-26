
public class KthLevel{
    static class Node{
        int data;
        Node left, right;

        public Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static int count = 0;
    public static void kLevel(Node root, int level, int k){
        if(root == null){
            return;
        }

        
        if(level == k){
            System.out.print(root.data+ " ");
            count++;
            return;
        }

        kLevel(root.left, level+1, k);
        kLevel(root.right, level+1, k);
    }

    public static void main(String [] args){

        Node root = new Node(1);
        root.left = new Node (2);
        root.right = new Node (3);
        root.left.left = new Node (4);
        root.left.right = new Node (5);
        root.right.left = new Node (6);
        root.right.right = new Node (7);

        int k = 3;
        System.out.print("The nodes are in  the " + k + " level is : ");
        kLevel(root, 1, k);
        System.out.println();
        System.out.println("The number of nodes in the Kth level is : " + count);   //if not want to count the nodes , just comment out this lines.
    }
}

