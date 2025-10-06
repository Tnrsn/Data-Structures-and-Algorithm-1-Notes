public class CircularLL {
    Node first;
    Node last;

    CircularLL()
    {

    }


    public boolean isEmpty()
    {
        if(first == null)
        {
            return true; //True means It's empty
        }

        return false;
    }

    public void addStudent(Student student)
    {
        Node newNode = new Node(student);

        //If LL isnt empty
        if(first != null)
        {
            last.link = newNode;
            newNode.link = first;
            last = newNode;
            return;
        }

        first = newNode;
        last = newNode;
        newNode.link = newNode;
    }

    public void OutputList()
    {
        if(isEmpty())
        {
            System.out.println("List is empty");
            return;
        }

        Node current = new Node();
        current = first;

        do 
        {
            System.out.println(current.data.toString());
            current = current.link;
        } while (current != first);
    }
}
