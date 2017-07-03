
public class BasicJava {
    Range age = new Range(5, 10);

    public void inspectRancge()
    {
        System.out.println(age.getMin());
    }

    // this is the entry point for BasicJava
    public static void main(String[] args)
    {
        new BasicJava().inspectRancge();
    }
}
