import java.util.ArrayList;

public class Calculator
{

    ArrayList<Ordered_Pair> list1;

    public Calculator()
    {

    }

    public void run()
    {
        Inputs hello = new Inputs(list1);
        hello.launch();
        hello.printList();
    }

}


