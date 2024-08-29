import java.util.ArrayList;

public class LowestCommonAncestor {
    static class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //Approach 1:  Time Complexity = O(N) , Space Complexity = O(N)
    public static boolean getPath(Node root, int n , ArrayList<Node> path){

        //base case
        if(root == null){
            return false;
        }
 
        path.add(root);

        if(root.data == n){
            return true;
        }

        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);

        if(foundLeft || foundRight){
            return true;
        }
        path.remove(path.size() - 1);
        return false;

    }

    public static Node lca(Node root, int n1, int n2){

    
        ArrayList<Node> path1 = new ArrayList<Node>();
        ArrayList<Node> path2 = new ArrayList<Node>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        //lowest or last common ancestor
        int i = 0;
        for(; i<path1.size() && i<path2.size(); i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }
        //last element equal node --> i-1th Node
        Node lca = path1.get(i-1);
        return lca;
    }

    //Approach 2: Time Complexity - O(N), Space Complexity - O(1)
     public static Node lca2(Node root, int n1, int n2){

        //Base case
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }

        Node leftLca = lca2(root.left, n1, n2);
        Node rightLca = lca2(root.right, n1, n2);

        //left == valid, right = null 
        if(rightLca == null){
            return leftLca;
        }

        //right = valid , left =null
        if(leftLca == null){
            return rightLca;
        }

        //if dono hi null nahi hue (Not Null) , Dono hi tree side ki value valid hui 
        return root;
     }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 4, n2 = 5;
        System.out.println(" Lowest Common Ancestor by approach 1 is " + lca(root, n1, n2).data);
        System.out.println(" Lowest Common Ancestor by approach 2 is " + lca2(root, n1, n2).data);
    }
}
