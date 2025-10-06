public class MyQueue {
    int front = 0;
    int back = 0;
    int size = 0;
    int capacity = 0;
    int[] arr;

    public MyQueue(int newCapacity)
    {
        capacity = newCapacity;
        arr = new int[capacity];
    }

    public boolean isFull()
    {
        if(size == capacity)
        {
            System.out.println("Queue is full!");
            return true;
        }

        return false;
    }

    public boolean isEmpty()
    {
        if(size == 0) return true;

        return false;
    }

    public void Enqueue(int item)
    {
        if(isFull()) return;

        if(isEmpty()) {
            arr[front] = item;
            back = front;
            size++;
            return;
        }
    
        back = (back + 1) % capacity;
        arr[back] = item;
        size++;
    }

    public void Dequeue()
    {
        if(isEmpty()) return;

        front = (front + 1) % capacity;
        size--;
    
        if(size == 0)
        {
            front = 0;
            back = 0;
        }
    }

    public int GetFront()
    {
        if(isEmpty()) return 0;

        return arr[front];
    }

    public int GetBack()
    {
        if(isEmpty()) return 0;

        return arr[back];
    }

    public void Debug()
    {
        System.out.println("Front.." + front);
        System.out.println("Back.." + back);
        System.out.println("size.." + size);
        System.out.println("capacity.." + capacity);
    }
}
