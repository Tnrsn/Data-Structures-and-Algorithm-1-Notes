public class StackLL {
    Node top;

    public StackLL()
    {

    }

    public boolean isEmpty()
    {
        if(top == null) return true;

        return false;
    }

    public void push(int value)
    {
        Node newNode = new Node();
        newNode.SetData(value);
        if(!isEmpty())
        {
            newNode.SetNext(this.top);
        }
        this.top = newNode;
    }

    public void pop()
    {
        if(isEmpty()) return;

        top = top.next;
    }

    public int peek()
    {
        if(isEmpty()) return 0;

        return top.data;
    }

    public void display()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty!");
            return;
        }

        Node current = top;

        while(current != null)
        {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
