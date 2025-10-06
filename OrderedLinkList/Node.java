public class Node {
    Student data;
    Node next;

    public Node()
    {

    }
    public Node(Student data) {
        this.data = data;
        this.next = null;
    }

    public void SetItem(Student student)
    {
        this.data = student;
    }

    public Student GetItem()
    {
        return data;
    }

    public void SetLink(Node next)
    {
        this.next = next;
    }
}
