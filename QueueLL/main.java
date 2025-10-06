public class main {

    public static void main(String[] args) {
        
        MyQueueLL myQueue = new MyQueueLL();

        myQueue.Enqueue(1);
        myQueue.Enqueue(2);
        myQueue.Enqueue(3);
        myQueue.Enqueue(4);
        myQueue.Enqueue(5);
        myQueue.Enqueue(6);

        myQueue.Dequeue();
        myQueue.Dequeue();
        myQueue.Dequeue();
        // myQueue.Dequeue();
        // myQueue.Dequeue();
        // myQueue.Dequeue();
        // myQueue.Dequeue();
        myQueue.Enqueue(4);


        myQueue.Output();
    }
}