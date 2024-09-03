public class SearchBST {
    static class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //INSERT
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

    //SEARCH
    public static boolean search(Node root, int key){
        if(root == null){ //not found
            return false;
        }
        if(root.data == key){ //found
            return true;
        }
        if(root.data > key){
            return search(root.left, key); //search in left subtree
        }
        else{
            return search(root.right, key);  //search in right subtree
        }
    }

    //MAIN
    public static void main(String [] args){

        int values[] = {5,1,3,4,2,7};
        Node root = null;

        for(int i = 0; i<values.length; i++){
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();

         //Test case 1: Key Found Case
        int key1 = 1;
       
        if(search(root, key1)){
            System.out.println("Key Found for node " + key1);
        }
        else{
            System.out.println("Key Not Found for node " + key1);
        }

        //Test case 2: Key Not Found
        int key2 = 6;
        
        if(search(root, key2)){
            System.out.println("Key Found for node " + key2);
        }else{
            System.out.println("Key Not Found for node " + key2);
        }
    }
}
