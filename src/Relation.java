import java.util.ArrayList;

public class Relation {

    private ArrayList<Ordered_Pair> relationArray;

    public Relation(ArrayList<Ordered_Pair> relationArray)
    {
        this.relationArray = relationArray;
    }

    public ArrayList<Ordered_Pair> getRelation()
    {
        return relationArray;
    }

}
