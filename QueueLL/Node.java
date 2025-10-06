public class Node {
    int data;
    Node next;
    
    Node(){

    }

    int GetData()
    {
        return data;
    }

    void SetData(int item)
    {
        data = item;
    }

    Node GetNext()
    {
        return next;
    }

    void SetNext(Node node)
    {
        next = node;
    }
}
