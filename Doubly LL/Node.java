public class Node {
    Student data;
    Node next;
    Node prev;

    public Node()
    {

    }
    public Node(Student data) 
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
    public Node(Student data, Node next) 
    {
        this.data = data;
        this.next = next;
        this.prev = null;
    }
    public Node(Student data, Node next, Node prev) 
    {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public void SetItem(Student student)
    {
        this.data = student;
    }

    public void SetPrev(Node prev)
    {
        this.prev = prev;
    }

    public void setNext(Node next)
    {
        this.next = next;
    }

    public Student GetItem()
    {
        return data;
    }

    public Node getPrev()
    {
        return prev;
    }

    public Node getNext()
    {
        return next;
    }
}
