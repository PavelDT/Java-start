package linkedlist;

public class Node
{
    private Node next;
    private String data;

    public Node(String data)
    {
        this.data = data;
    }

    public Node getNext()
    {
        return next;
    }

    public void setNext(Node next)
    {
        this.next = next;
    }

    public String getValue()
    {
        return data;
    }

    public void setValue(String data)
    {
        //..
    }
}