/**
 * Created by keyxjq7 on 7/3/2017.
 */
public class Range
{
    private int max;
    private int min;

    public Range(int min, int max)
    {
        this.max = max;
        this.min = min;
    }

    // accessor
    public int getMin()
    {
        return min;
    }

    // mutator
    // setMin is gray because it's not yet being called from anywhere.
    // This is IntelliJ Specific.
    public void setMin(int newMin)
    {
        min = newMin;
    }
}
