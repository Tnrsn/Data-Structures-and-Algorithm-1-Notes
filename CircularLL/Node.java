public class Node {
    Student data;
    Node link;

    public Node()
    {

    }
    public Node(Student data) 
    {
        this.data = data;
        this.link = null;
    }
    public Node(Student data, Node link) 
    {
        this.data = data;
        this.link = link;
    }

    public void SetItem(Student student)
    {
        this.data = student;
    }

    public void setLink(Node link)
    {
        this.link = link;
    }

    public Student GetItem()
    {
        return data;
    }

    public Node getLink()
    {
        return link;
    }
}
