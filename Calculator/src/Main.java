import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        new Main();
    }

    //private attributes
    private JFrame frame1;
    private JPanel panel1;
    private JTextField textfield1;
    private JTextField textfield2;
    private JTextField textfield3;

    private JRadioButton addRadioButton;
    private JRadioButton minusRadioButton;
    private JRadioButton timesRadioButton;
    private JRadioButton dividedByRadioButton;
    private JRadioButton memoryRadioButton;
    private JRadioButton memoryRecallRadioButton;


    private JButton equalsButton;
    private JButton cancelButton;

    private BasicCalculator calc1;
    private MemoryCalculator calc2;
    //public methods

    //constructor
    public Main() {

        calc1 = new BasicCalculator();
        calc2= new MemoryCalculator();
        frame1 = new JFrame();
        frame1.setTitle("Calculator Project");
        frame1.setLocation(30, 30);  //offset from top left of the screen

        frame1.setResizable(true);
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBackground(new Color(12, 236, 229));
        frame1.add(panel1);

        textfield1 = new JTextField(22);
        textfield1.setText("0");
        textfield1.setHorizontalAlignment(SwingConstants.RIGHT);
        textfield1.setBounds(10, 30, 120, 25);

        textfield2 = new JTextField(22);
        textfield2.setText("0");
        textfield2.setHorizontalAlignment(SwingConstants.RIGHT);
        textfield2.setBounds(10, 200, 120, 25);

        addRadioButton = new JRadioButton();
        addRadioButton.setText("Add");
        addRadioButton.setBounds(10, 70, 70, 25);
        addRadioButton.setSelected(true);

        minusRadioButton = new JRadioButton();
        minusRadioButton.setText("Minus");
        minusRadioButton.setBounds(90, 70, 70, 25);

        timesRadioButton = new JRadioButton();
        timesRadioButton.setText("Times");
        timesRadioButton.setBounds(90, 90, 70, 25);

        dividedByRadioButton = new JRadioButton();
        dividedByRadioButton.setText("Divide");
        dividedByRadioButton.setBounds(10, 90, 70, 25);

        memoryRadioButton = new JRadioButton();
        memoryRadioButton.setText("Memory");
        memoryRadioButton.setBounds(150, 300, 80, 25);
        memoryRadioButton.addActionListener(e -> memoryRadioButton_click());


        memoryRecallRadioButton = new JRadioButton();
        memoryRecallRadioButton.setText("MemoryRecall");
        memoryRecallRadioButton.setBounds(150, 30, 120, 25);
        memoryRecallRadioButton.addActionListener(e -> memoryRecallRadioButton_click());



        ButtonGroup bg = new ButtonGroup();
        bg.add(addRadioButton);
        bg.add(minusRadioButton);
        bg.add(timesRadioButton);
        bg.add(dividedByRadioButton);
        bg.add(memoryRadioButton);
        bg.add(memoryRecallRadioButton);

        equalsButton = new JButton("=");
        equalsButton.setBounds(10, 240, 60, 25);
        equalsButton.setName("equalsButton");
        equalsButton.addActionListener(e -> equalsButton_click());

        cancelButton = new JButton("C");
        cancelButton.setBounds(80, 240, 60, 25);
        cancelButton.setName("cancelButton");
        cancelButton.addActionListener(e -> cancelButton_click());


        textfield3 = new JTextField(22);
        textfield3.setText("0");
        textfield3.setHorizontalAlignment(SwingConstants.RIGHT);
        textfield3.setBounds(10, 300, 120, 25);
        textfield3.setBackground(new Color(255, 255, 0));

        panel1.add(textfield1);
        panel1.add(addRadioButton);
        panel1.add(minusRadioButton);
        panel1.add(textfield2);
        panel1.add(equalsButton);
        panel1.add(cancelButton);
        panel1.add(textfield3);
        panel1.add(dividedByRadioButton);
        panel1.add(timesRadioButton);
        panel1.add(memoryRecallRadioButton);
        panel1.add(memoryRadioButton);

        frame1.setMinimumSize(new Dimension(600, 400));
    }


    public void equalsButton_click() {

        double n1 = Double.parseDouble(textfield1.getText());
        double n2 = Double.parseDouble(textfield2.getText());

        if (addRadioButton.isSelected()) {
            textfield3.setText(String.valueOf(calc1.add(n1, n2)));
        }

        if (minusRadioButton.isSelected()) {
            textfield3.setText(String.valueOf(calc1.subtract(n1, n2)));
        }

        if (timesRadioButton.isSelected()) {
            textfield3.setText(String.valueOf(calc1.times(n1, n2)));

        }

        if (dividedByRadioButton.isSelected()) {
            textfield3.setText(String.valueOf(calc1.dividedBy(n1, n2)));


        }



    }
    public void cancelButton_click() {
        textfield3.setText("");
    }

    public void memoryRadioButton_click(){
        calc2.clearMemory();
        double n1 = Double.parseDouble(textfield3.getText());
        calc2.addToMemory(n1);
        textfield3.setText("");


    }
    public void memoryRecallRadioButton_click(){textfield1.setText(String.valueOf(calc2.memoryRecall()));}
}