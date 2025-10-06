public class MyQueueLL {
    
    Node front;
    Node back;
    int size;

    public boolean isEmpty()
    {
        if(size == 0) return true;

        return false;
    }

    public void Enqueue(int data)
    {
        Node newNode = new Node();
        newNode.SetData(data);
        
        if(isEmpty())
        {
            size++;
            front = newNode;
            back = newNode;
            newNode.next = back;
            return;
        }

        size++;
        back.next = newNode;
        back = newNode;
    }

    public void Dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty!");
            return;
        }

        front = front.next;
        size--;
    }


    public void Output()
    {
        if(isEmpty()) 
        {
            System.out.println("Queue is empty!");
            return;
        }

        Node current = new Node();
        current = front;

        do {
            System.out.println(current.data);
            current = current.next;
        } while (current != null);
    }
}
