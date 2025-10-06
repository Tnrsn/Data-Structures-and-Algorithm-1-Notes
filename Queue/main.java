public class main {

    public static void main(String[] args) {
        
        MyQueue myQueue = new MyQueue(3);


        myQueue.Enqueue(1);
        myQueue.Enqueue(5);
        myQueue.Enqueue(7);
        // myQueue.Enqueue(8);
        
        myQueue.Dequeue();
        // myQueue.Dequeue();
        // myQueue.Dequeue();

        myQueue.Enqueue(1);
        myQueue.Enqueue(1);
        
        // System.out.println("Back:  " + myQueue.GetBack());
        // System.out.println("Front:  " + myQueue.GetFront());

        myQueue.Debug();
    }
}