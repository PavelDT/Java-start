public class CircularQueue
{
    // string array representing the queue
    private String [] queue;
    // next available position in queue to be used
    private int positionInQueue;

    /**
     * Default constructor
     */
    public CircularQueue()
    {
        // Initialise a buffer with 15 slots.
        // This buffer will be treated as a circular queue, if it
        // gets filled up aka index 14 has an item in it the buffer
        // will begin overwriting items starting back at index 0
        queue = new String[15];
        // Set position to be at beginning of queue
        positionInQueue = 0;
    }

    public static void main(String[] args)
    {
        CircularQueue circularQueue = new CircularQueue();
        circularQueue.runTest();
    }

    public void addItem(String toAdd)
    {
        // check if queue pointer is at the end of the queue
        if (positionInQueue == 14)
        {
            // reset pointer back to the head of the queue.
            positionInQueue = 0;
        }
        queue[positionInQueue] = toAdd;
    }

    public void displayQueue()
    {
        for(int i=0; i<15; i++)
        {
            // null check
            if (queue[i] != null)
            {
                System.out.println("Queue position " + i + ":" + queue[i]);
            }
        }
    }

    /**
     * Remove the last item to be added to the queue.
     */
    public boolean removeFromTail()
    {
        int tailPositionInQueue;
        // Edge case.
        // Position 0 means that:
        // a) The queue is empty
        // b) The queue is full, and the position has jumped back
        //    to index 0 to begin overwriting items.
        if (positionInQueue == 0)
        {
            // b) full queue
            // this check can fail if a 'removeAtPosition'
            // was carried out and made index 14 null.
            // potential solution: Use a boolean to signify if anything
            // was ever added to the queue.
            if (queue[14] != null)
            {
                tailPositionInQueue = 14;
            }
            // a) empty queue, there is nothing to remove.
            else
            {
                System.out.println("Nothing to remove");
                return false;
            }
        }
        // remove a previous item.
        else
        {
            tailPositionInQueue = positionInQueue - 1;
        }

        System.out.println(queue[tailPositionInQueue] + " removed.");
        queue[tailPositionInQueue] = null;
        // decrement the current queue position.
        positionInQueue = positionInQueue - 1;
        // signify that an item was actually removed.
        return true;
    }

    /**
     * Removes at specific position, validates position is valid.
     */
    public boolean removeAtPosition(int atQueuePosition)
    {
        if (atQueuePosition < 0 || atQueuePosition > 14)
        {
            System.out.println("Invalid index, must be between 0 and 14 (both inclusive)");
            return false;
        }

        System.out.println(queue[atQueuePosition] + " removed");
        // remove at that position by setting to null
        // This will cause fragmentation of the queue but
        // shifting all other items would be expensive.
        queue[atQueuePosition] = null;

        // signify that an item was actually removed.
        return true;
    }

    /**
     * Add 10 items to queue,
     * Display said queue.
     * Add 5 more items.
     * Remove 3 items.
     * Validate queue position
     */
    public void runTest()
    {
        // position 0
        for (int i = 0; i < 10; i++)
        {
            addItem(Integer.toString(i));
        }
        displayQueue();
        // position 10
        for (int i = 0; i < 5; i++)
        {
            addItem(Integer.toString(i));
        }
        // position 0 (queue full, we go back to the start)
        for (int i = 0; i < 3; i++)
        {
            removeFromTail();
        }
        // position 13
        if (positionInQueue == 13)
        {
            System.out.println("So far so good.");
        }
    }
}
