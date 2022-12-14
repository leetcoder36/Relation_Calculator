public class Ordered_Pair {
    private final int a;
    private final int b;

    public Ordered_Pair(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    public int getA()
    {
        return a;
    }

    public int getB()
    {
        return b;
    }

    public String getOrdered_Pair()
    {
        return "(" + a + ", " + b + ")";
    }
}
