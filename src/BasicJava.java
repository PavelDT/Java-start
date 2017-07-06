import java.util.List;
import java.util.ArrayList;

public class BasicJava {
    Range age = new Range(5, 10);

    public void inspectRancge()
    {
        System.out.println(age.getMin());
    }

    // this is the entry point for BasicJava
    public static void main(String[] args)
    {
        BasicJava baseJava = new BasicJava();
        // baseJava.inspectRancge();
        BasicJava.countTo5();
        baseJava.printCollection();
    }

    public static void countTo5()
    {
        for (int i = 1; i < 11; i++)
        {
            String message = "this is a simple counter " + i;
            System.out.println(message);
        }
    }

    public void printCollection()
    {
        List<Integer> l = new ArrayList<Integer>();
        l.add(3);
        l.add(4);
        l.add(-31);

        for(int a : l)
        {
            System.out.println("Print variable in list " + a);
        }
    }
}