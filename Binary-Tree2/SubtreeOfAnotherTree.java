public class SubtreeOfAnotherTree{
    
    static class Node{
        int data;
        Node left, right;

        public Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
//Step 2: Check Identical or non-Identical
public static boolean isIdentical(Node node, Node subRoot){

    if(node == null && subRoot == null){  //dono hi null hue to
        return true;
    }
    else if(node == null || subRoot == null || node.data != subRoot.data){ //ek bhi sahi hua to onlly
        return false;
    }

    //check in left identical
    if(!isIdentical(node.left, subRoot.left)){
        return false;
    }
    if(!isIdentical(node.right, subRoot.right)){
        return false;
    }

    //if these four not applicable then the subtree is identical so return true
    return true;
}
    //step 1 : Check SubRoot in Tree
    public static boolean isSubtree(Node root, Node subRoot){

        //base case
        if(root == null) return false;

        //checking the data
        if(root.data == subRoot.data){
            if(isIdentical(root, subRoot)){
                return true;
            }
        }

        /** //elaborate version
        //for finding in left
        boolean leftAns = isSubtree(root.left, subRoot);
        
        //for finding in right
        boolean rightAns = isSubtree(root.right, subRoot);

        return leftAns || rightAns;
        */

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    

    //main
    public static void main(String [] args){
        //root 
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node (3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node (7);

        //subtree
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        //calling function
        System.out.println("The Subtree of Another Tree is Exactly equal to the Main Tree : " + isSubtree(root, subRoot));

    }

}
