public class Diameter {
    static class Node{
        int data;
        Node left, right;

        public Node (int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root){
        if(root == null) return 0;

        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh, rh) + 1;
    }


    //Approach 1 : Time Complexity = O(N^2) ---> In this calculating the height of N Nodes takes O(N) time each so overall time complexity is O(N^2), otherwise recusrsive method for calculating diameter takes O(N).
    public static int diameter (Node root){
        if(root == null) return 0;

        int leftDiam = diameter(root.left);
        int rightDiam = diameter(root.right);

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int selfDiameter = leftHeight + rightHeight + 1;

        return Math.max(selfDiameter, Math.max(leftDiam, rightDiam));
    }

    //Approach 2 : Time Complexity = O(N) ---> here we are calculating the height(ht) and diameter(diam) in the function itself (sath ke sath me hi har Node ke liye calculate karte ja rahe hai). So thats why it takes O(N) time. 
    static class Info {
        int diam;
        int ht;

        public Info (int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameter2 (Node root){
       if(root == null){
        return new Info(0,0);
       }

       Info leftInfo = diameter2(root.left);
       Info rightInfo = diameter2(root.right);

       int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
       int ht = Math.max(leftInfo.ht , rightInfo.ht) + 1;

       return new Info(diam, ht);
    }
    public static void main(String [] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);

        System.out.println("Diameter of the Binary Tree by Approach 1: " + diameter(root));
        System.out.println("Diameter of the Binary Tree by Approach 2: " + diameter2(root).diam);
   }

}
