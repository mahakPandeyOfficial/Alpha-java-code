import java.util.*;

public class TopViewOfTree {
    static class Node{
        int data;
        Node left, right;

        public Node (int data){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    static class Info{
        Node node;
        int hd;  //horizontal distance

        public Info(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root){

        //Level Order Traversing
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0, max = 0;

        q.add(new Info(root, 0));  //add root node first
        q.add(null);  //null for level wise check

        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr == null){
                if(q.isEmpty()) break;
                else q.add(null);
            }else{
                if(!map.containsKey(curr.hd)){
                    map.put(curr.hd, curr.node);
                }

                //for left tree
                if(curr.node.left != null){
                    q.add(new Info(curr.node.left, curr.hd-1));
                    min = Math.min(min, curr.hd-1);
                }
                //for right tree
                if(curr.node.right != null){
                    q.add(new Info(curr.node.right, curr.hd+1));
                    max = Math.max(max, curr.hd+1);
                }
            }
        }

        //print data in order from min to max
        for(int i = min; i<=max; i++){
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();
    }

    //Main
    public static void main(String [] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);

        /**
         *         1
         *        / \
         *       2   3
         *        \
         *         4
         *          \
         *           5
         *            \ 
         *             6    
         * Output = 2,1,3,6
         */
         
         System.out.print("Top View of the Binary Tree is : ");
         topView(root);
    }
}
