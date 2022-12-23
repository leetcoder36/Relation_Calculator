import java.util.ArrayList;

public class Calculator
{

    private ArrayList<Ordered_Pair> list1;
    private boolean end = false;

    public Calculator()
    {
        this.list1 = new ArrayList<>();
    }

    public void run()
    {
        Inputs hello = new Inputs(list1);
        hello.launch();
        if(!hello.getRunning())
        {
            end = true;
        }
        else {
            this.list1 = hello.getList();
            if (this.isSymmetric())
                System.out.println("Symmetric");
            else
                System.out.println("Not symmetric");
            if (this.isAntisymmetric())
                System.out.println("Antisymmetric");
            else
                System.out.println("Not antisymmetric");
            if (this.isTransitive())
                System.out.println("Transitive");
            else
                System.out.println("Not transitive");
            list1.clear();
        }
    }


    public boolean getEnd()
    {
        return end;
    }

    public boolean isSymmetric()
    {
        boolean found;
        for(int i = 0; i < list1.toArray().length; i++)
        {
            found = false;
            for(int k = 0; k < list1.toArray().length; k++)
            {
                if ((list1.get(i).getA() == list1.get(k).getB()) && (list1.get(i).getB() == list1.get(k).getA())) {
                    found = true;
                    break;
                }
            }
            if(!found)
                return false;




        }
        return true;
    }

    public boolean isAntisymmetric()
    {
        boolean found;
        for(int i = 0; i < list1.toArray().length; i++)
        {
            found = false;
            for (int k = 0; k < list1.toArray().length; k++) {
                if ((list1.get(i).getA() == list1.get(k).getB()) && (list1.get(i).getB() == list1.get(k).getA()) && (list1.get(i).getA() != list1.get(k).getA())) {
                    found = true;
                    break;
                }

            }
            if(found)
                return false;

        }
        return true;





    }
    public boolean isTransitive()
    {
        boolean found_a_c;
        for(int i = 0; i < list1.toArray().length; i++)
        {
            for(int k = 0; k < list1.toArray().length; k++)
            {
                if((list1.get(i).getB() == list1.get(k).getA()) && (i != k))
                {
                    found_a_c = false;
                    for(int l = 0; l < list1.toArray().length; l++)
                    {
                        if ((list1.get(l).getA() == list1.get(i).getA()) && (list1.get(l).getB() == list1.get(k).getB())) {
                            found_a_c = true;
                            break;
                        }
                    }
                    if(!found_a_c)
                    {
                        return false;
                    }
                }

            }
        }
        return true;

    }



}


