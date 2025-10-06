public class DoublyLL {
    Node first;
    Node last;

    public DoublyLL()
    {
        this.first = null;
        this.last = null;
    }

    public boolean IsEmpty()
    {
        if(first.next == null && first.prev == null)
        {
            return true; //true means it's empty
        }

        return false;
    }

    //Inserts to beginning of LL
    public void insertAtBack(Student student) 
    {
        Node newNode = new Node(student);
        //if LL is empty
        if(first == null)
        {
            first = newNode;
            last = newNode;
            return;
        }

        newNode.next = first;
        first.prev = newNode;
        first = newNode;
    }

    //Inserts to end of LL
    public void insertAtFront(Student student)
    {

        Node newNode = new Node(student);
        if(last == null)
        {
            first = newNode;
            last = newNode;
            return;
        }

        newNode.prev = last;
        last.next = newNode;
        last = newNode;
    }

    public boolean removeFromBack()
    {
        if(first != null && first.next != null)
        {
            first.next.prev = null;
        }
        if(first != null)
        {
            first = first.next;
            return true;
        }
        return false;
    }

    public boolean removeFromFront()
    {
        if(last != null && last.prev != null)
        {
            last.prev.next = null;
        }
        if(last != null)
        {
            last = last.prev;
            return true;
        }
        return false;
    }

    public void OutputList()
    {
        if(IsEmpty())
        {
            System.out.println("Linked List is Empty");
            return;
        }

        Node current = first;
        int counter = 1;

        while(current != null)
        {
            System.out.println(counter + "- " + "ID: " + current.data.id + " Name: " + current.data.Name + " GPA: " + current.data.GPA);
            current = current.next;
            counter++;
        }
    }

    public void OutputListBackwards()
    {
        if(IsEmpty())
        {
            System.out.println("Linked List is Empty");
            return;
        }

        Node current = last;
        int counter = 1;

        while(current != null)
        {
            // System.out.println(counter + "- " + "ID: " + current.data.id + " Name: " + current.data.Name + " GPA: " + current.data.GPA);
            System.out.println(counter + "- " + current.toString());
            current = current.prev;
            counter++;
        }
    }
}
