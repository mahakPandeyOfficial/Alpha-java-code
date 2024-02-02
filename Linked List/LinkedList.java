import java.util.*;

public class LinkedList{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        //step 1: create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
          head = tail = newNode;
          return;
        }
        //step 2: new node k next ko head ke liye point kardo
        newNode.next = head;

        //step 3: head ko new node k equal kardo
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print(){
        if(head == null){
            System.out.println("LL is empty!");
            return;
        }
        Node temp = head;
        while(temp != null){
           System.out.print(temp.data + " -> ");   //temporary ka data daal diya
           temp = temp.next;   //update
        }
        System.out.println("null");
    }

    public void addMiddle(int index, int data){
        if(index == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i < index-1){  //jab tak chalana h loop jab tak node ke previous tak na poch jaye
            temp = temp.next;
            i++;
        }
        //i --> index-1 tak poch gya toh
        newNode.next = temp.next;
        temp.next = newNode;
        
    }

    public int removeFirst(){
        if(size == 0){
            System.out.println("The LL is empty!");
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    //Remove from last of list
    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty!");
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        
        for(int i = 0; i<size-2; i++){
            prev = prev.next;
        }
        int val = prev.next.data;  //tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    // Iterative Search
  public static int itrativeSearch(int key){
        Node temp = head;
        int i = 0;

        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public static void main(String [] args){
       LinkedList ll = new LinkedList();

       
       ll.addFirst(2);
       ll.print();
       ll.addFirst(1);
       ll.print();

       //adding at last
       ll.addLast(3);
       ll.print();
       ll.addLast(4);
       ll.print();

       //middle adding
       ll.addMiddle(2,9);
       ll.print();

       //remove first node
       System.out.println( "Size of linked list : " + ll.size);
       ll.removeFirst();
       ll.print();

       //remove last node 
       ll.removeLast();
       ll.print();
        
    System.out.println(ll.itrativeSearch(3));   //key found
       System.out.println(ll.itrativeSearch(10));   //key not found
      
    }
}
