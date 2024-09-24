import java.util.*;

public class Root2leafPath{

    static  class Node{
        int data;
        Node left, right;

           public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
           }
    }

    //insert
    public static Node insert(Node root, int val){
        if(root == null){
            //create a new Node
            root = new Node(val);
            return root;
        }

        //left subtree
        if(root.data > val){
            root.left = insert(root.left, val);
        }else{
            //right subtree
            root.right = insert(root.right, val);
        }
        return root;
    }

    //inorder traversal
    public static void inorder(Node root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void printPath(ArrayList<Integer> path){
        for(int i = 0; i<path.size(); i++){
            System.out.print(path.get(i) + "->");
        }
        System.out.println("Null");
    }

    public static void printRoot2leaf(Node root, ArrayList<Integer> path){
        if(root ==  null) return;

        path.add(root.data);
        if(root.left == null && root.right == null){
            printPath(path);
        }

        //left subtree
        printRoot2leaf(root.left, path);
        //right subtree
        printRoot2leaf(root.right, path);

        path.remove(path.size()-1);
    }

    public static void main(String [] args){
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for(int i = 0; i<values.length; i++){
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();

        printRoot2leaf(root, new ArrayList<>());
    }
}