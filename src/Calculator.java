import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class Calculator {
   JPanel windowContent;
   JTextField displayField;
   JButton button0;
   JButton button1;
   JButton button2;
   JButton button3;
   JButton button4;
   JButton button5;
   JButton button6;
   JButton button7;
   JButton button8;
   JButton button9;
   JButton buttonPoint;
   JButton buttonEqual;
   JButton buttonPlus;
   JButton buttonMinus;
   JButton buttonDelenie;
   JButton buttonUmnozhenie;
   JButton buttonDelete;
   JPanel pl;
   JPanel p2;

    public Calculator() {
        windowContent= new JPanel();
        BorderLayout bl = new BorderLayout();
        windowContent.setLayout(bl);
        displayField = new JTextField(50);
        windowContent.add("North", displayField);
        //windowContent.add("West",displayField);
        button0=new JButton("0");
        button1=new JButton("1");
        button2=new JButton("2");
        button3=new JButton("3");
        button4=new JButton("4");
        button5=new JButton("5");
        button6=new JButton("6");
        button7=new JButton("7");
        button8=new JButton("8");
        button9=new JButton("9");
        buttonPoint = new JButton(".");
        buttonEqual = new JButton("=");
        buttonPlus = new JButton("+");
        buttonMinus = new JButton("-");
        buttonUmnozhenie = new JButton("*");
        buttonDelenie = new JButton("/");
        buttonDelete = new JButton("DEL");



        pl=new JPanel();
        p2 = new JPanel();
        GridLayout gl = new GridLayout(5,3,3,3);
        GridLayout gl2 = new GridLayout(4,1,3,3);
        pl.setLayout(gl);
        p2.setLayout(gl2);
        pl.add(buttonDelete);
        pl.add(buttonPoint);
        pl.add(buttonEqual);
        pl.add(button1);
        pl.add(button2);
        pl.add(button3);
        pl.add(button4);
        pl.add(button5);
        pl.add(button6);
        pl.add(button7);
        pl.add(button8);
        pl.add(button9);
        pl.add(button0);
        p2.add(buttonPlus);
        p2.add(buttonMinus);
        p2.add(buttonUmnozhenie);
        p2.add(buttonDelenie);

        windowContent.add("Center", pl);
        windowContent.add("East",p2);

        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(windowContent);
        frame.pack();
        frame.setVisible(true);
        CalculatorEngine calculatorEngine = new CalculatorEngine(this);
        button0.addActionListener(calculatorEngine);
        button1.addActionListener(calculatorEngine);
        button2.addActionListener(calculatorEngine);
        button3.addActionListener(calculatorEngine);
        button4.addActionListener(calculatorEngine);
        button5.addActionListener(calculatorEngine);
        button6.addActionListener(calculatorEngine);
        button7.addActionListener(calculatorEngine);
        button8.addActionListener(calculatorEngine);
        button9.addActionListener(calculatorEngine);
        buttonDelenie.addActionListener(calculatorEngine);
        buttonUmnozhenie.addActionListener(calculatorEngine);
        buttonEqual.addActionListener(calculatorEngine);
        buttonMinus.addActionListener(calculatorEngine);
        buttonPlus.addActionListener(calculatorEngine);
        buttonPoint.addActionListener(calculatorEngine);
        buttonDelete.addActionListener(calculatorEngine);

    }


}
