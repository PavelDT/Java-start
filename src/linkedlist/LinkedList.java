package linkedlist;

public class LinkedList
{
    private Node head;
    // if we dont keep track of the tail, we will
    // have to parse the full list to add items.
    private Node tail;

    public static void main(String[] args)
    {
        new LinkedList().runTest();
    }

    public void add(String data)
    {
        // empty list, adding to head.
        if (head == null)
        {
            head = new Node(data);
        }
        // we only have 1 item, another edge case.
        else if (head != null && tail == null)
        {
            tail = new Node(data);
            head.setNext(tail);
        }
        // default case, more than 2 values,
        // keep adding to tail.
        else
        {
            Node toAdd = new Node(data);
            tail.setNext(toAdd);
            tail = toAdd;
        }
    }

    public void remove()
    {
        // todo
    }

    public void displayAll()
    {
        Node current = head;
        while (current != null)
        {
            System.out.println("item: " + current.getValue());
            current = current.getNext();
        }
        System.out.println("----------");
    }

    public void runTest()
    {
        add("1");
        add("2");
        add("3");
        add("4");
        add("5");
        add("6");
        displayAll();
        add("7");
        add("8");
        add("9");
        displayAll();
    }
}