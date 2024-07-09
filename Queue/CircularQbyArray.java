public class CircularQbyArray {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

       Queue(int n){
           arr = new int[n];
           size = n;
           rear = -1;
           front = -1;
       }

       //is Empty
       public static boolean isEmpty(){
           return rear == -1 && front == -1;
       }

       //is Full
       public static boolean isFull(){
           return (rear + 1)% size == front;
       }
       
       //Add
       public static void add(int data){
           if(isFull()){    //it will check if the queue is full or not
               System.out.println("Queue is Full");
               return;
           }
           //add 1st element
           if(front == -1){
            front = 0;
           }
           rear = (rear + 1) % size;
           arr[rear] = data;
       }

       //Remove
       public static int remove(){
           if(isEmpty()){
               System.out.println("Queue is Empty");
               return -1;
           }
        int result = arr[front];
           //last element delete kar rahe hai toh
           if(rear == front){
            rear = front = -1;
           }else{
            front = (front + 1) % size;
           }
           
           return result;
       }

       //Peek = TOP = Front value
       public static int peek(){
           if(isEmpty()){
               System.out.println("Queue is Empty");
               return -1;
           }
           return arr[front];
       }
   }

   public static void main(String[] args) {

       Queue q = new Queue(3);

       q.add(1);
       q.add(2);
       q.add(3);
       System.out.println(q.remove());
       q.add(4);
       System.out.println(q.remove());
       q.add(5);
       
       
       

       while(!q.isEmpty()){
           System.out.println(q.peek());
           q.remove();
       }
   }  
}
