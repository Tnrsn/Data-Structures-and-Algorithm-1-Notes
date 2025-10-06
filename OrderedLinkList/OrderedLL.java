import java.security.cert.TrustAnchor;

import javax.swing.plaf.TreeUI;

public class OrderedLL {
    private Node head;

    public OrderedLL() {
        this.head = null;
    }


    public void Insert(Student student)
    {
        Node newNode = new Node(student);

        if (head != null) 
        {
            Node counter = head;
    
            // If new node needs to replace head node
            if (head.data.Name.compareTo(newNode.data.Name) > 0) 
            {
                newNode.next = head;
                head = newNode;
                return;
            }
    
            // 
            while (counter.next != null && counter.next.data.Name.compareTo(newNode.data.Name) < 0) 
            {
                counter = counter.next;
            }
            newNode.next = counter.next;
            counter.next = newNode;

        } 
        else 
        { // If there are no nodes at all
            head = newNode;
        }
    }

    public boolean IsEmpty()
    {
        //True means Its empty
        if(head == null) return true;
        return false;
    }

    public void OutputList()
    {
        Node counter = head;

        System.out.println("........");
        System.out.println("ID: " + counter.data.id);
        System.out.println("Name: " + counter.data.Name);
        System.out.println("GPA: " + counter.data.GPA);

        while(counter.next != null)
        {
            counter = counter.next;
            System.out.println("........");
            System.out.println("ID: " + counter.data.id);
            System.out.println("Name: " + counter.data.Name);
            System.out.println("GPA: " + counter.data.GPA);
        }
    }

    public int GetSize()
    {
        Node counter = head;
        int intCounter = 1;

        if (counter == null) return 0;
        while(counter.next != null)
        {
            counter = counter.next;
            intCounter++;
        }

        return intCounter;
    }

    
    public boolean Search(Student student)
    {
        Node counter = head;

        if (counter == null) return false;

        while(counter.next != null)
        {
            if(counter.data == student) return true;
            counter = counter.next;
        }

        return false;
    }
}
