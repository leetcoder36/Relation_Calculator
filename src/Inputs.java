import java.util.ArrayList;
import java.util.Scanner;

public class Inputs {

     private ArrayList<Ordered_Pair> list;
     private boolean running = true;

    public Inputs(ArrayList<Ordered_Pair> list)
    {
        this.list = list;
    }

    public void launch()
    {
        int first; int second; int count;
        Scanner scan = new Scanner(System.in);
        Ordered_Pair pair;
        System.out.println("This program takes a relation as input and determines its symmetry, antisymmetry, and" +
                " transitivity.");
        System.out.println("How many ordered pairs are in your relation? /n (enter 0 to end program)");
        int input = scan.nextInt();
        if(input == 0)
        {
            running = false;
        }
        else if(input > 0) {
            count = input;
            for (int i = 0; i < count; i++) {
                System.out.println("Let's add an ordered pair");
                System.out.println("Enter the first element of the ordered pair");
                first = scan.nextInt();
                System.out.println("Enter the second element of the ordered pair");
                second = scan.nextInt();
                pair = new Ordered_Pair(first, second);
                list.add(pair);
                this.printList();


            }





        }
        else
        {
            System.out.println("Invalid input");

        }

    }

    public ArrayList<Ordered_Pair> getList()
    {
        return list;
    }

    public boolean getRunning()
    {
        return running;
    }
    public void printList()

    {
        System.out.println("Your relation is:");
        System.out.print("{");
        for(int i = 0; i < list.toArray().length - 1; i++)
            System.out.print(list.get(i).getOrdered_Pair() + ", ");
        System.out.println(list.get(list.toArray().length - 1).getOrdered_Pair() + "}");
    }


}
