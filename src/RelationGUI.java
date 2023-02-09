import javax.swing.*;
import java.util.ArrayList;

public class RelationGUI extends JFrame{
    private JPanel panel;
    private JLabel info;
    private JLabel prompt;
    private JTextField textField1;
    private JLabel relationPrintOut;
    private JButton calculateButton;
    private JButton addButton;
    private JLabel relation;
    private JLabel symmetryLabel;
    private JLabel antisymmetryLabel;
    private JLabel transitivityLabel;
    private JButton clearButton;
    private String input;
    private final Calculator calc;

    private final ArrayList<Ordered_Pair> relationList;

    public RelationGUI()
    {
        setContentPane(panel);
        setTitle("Relation Calculator");
        setSize(600, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        relationList = new ArrayList<>();
        calc = new Calculator();


        addButton.addActionListener(e -> {
            input = textField1.getText();
            int commaLoc = input.indexOf(",");
            String output;
            if(commaLoc >= 0) {
                int first = Integer.parseInt(input.substring(0, commaLoc));
                int second = Integer.parseInt(input.substring(commaLoc + 2));
                Ordered_Pair pair = new Ordered_Pair(first, second);
                relationList.add(pair);
            }
            textField1.setText("");
            if (relationList.toArray().length > 0)
            {
                StringBuilder outputBuilder = new StringBuilder("{");
                for(int i = 0; i < relationList.toArray().length - 1; i++)
                {
                    outputBuilder.append("(").append(relationList.get(i).getA()).append(", ").append(relationList.get(i).getB()).append("), ");
                }
                output = outputBuilder.toString();
                output += relationList.get(relationList.toArray().length - 1).getOrdered_Pair() + "}";
                relation.setText(output);
            }
            symmetryLabel.setText("");
            antisymmetryLabel.setText("");
            transitivityLabel.setText("");



        });
        calculateButton.addActionListener(e -> {
            if(relationList.toArray().length > 0) {
                if (calc.isSymmetric(relationList)) {
                    symmetryLabel.setText("Symmetric");
                } else {
                    symmetryLabel.setText("Not symmetric");
                }
                if (calc.isAntisymmetric(relationList)) {
                    antisymmetryLabel.setText("Antisymmetric");
                } else {
                    antisymmetryLabel.setText("Not antisymmetric");
                }
                if (calc.isTransitive(relationList)) {
                    transitivityLabel.setText("Transitive");
                } else {
                    transitivityLabel.setText("Not transitive");
                }
            }


        });
        clearButton.addActionListener(e -> {
            relation.setText("Empty");
            relationList.clear();
            symmetryLabel.setText("");
            antisymmetryLabel.setText("");
            transitivityLabel.setText("");
        });
    }

}
