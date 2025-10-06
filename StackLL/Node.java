public class Node {
    int data;
    Node next;

    public int GetData()
    {
        return data;
    }

    public void SetData(int value)
    {
        this.data = value;
    }

    public Node GetNext()
    {
        return next;
    }

    public void SetNext(Node node)
    {
        this.next = node;
    }
}
