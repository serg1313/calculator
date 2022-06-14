import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class SimpleCalculator {
    public static void main(String[] args) {

        JPanel windowContent = new JPanel();

        GridLayout gl = new GridLayout(4,2);
        windowContent.setLayout(gl);

        JLabel jLabel = new JLabel("Number 1");
        JTextField jTextField = new JTextField(10);
        JLabel jLabel1 = new JLabel("Number 2");
        JTextField jTextField1 = new JTextField(10);
        JLabel jLabel2 = new JLabel("sum: ");
        JTextField result = new JTextField(10);
        JButton go = new JButton("add");
        windowContent.add(jLabel);
        windowContent.add(jTextField);
        windowContent.add(jLabel1);
        windowContent.add(jTextField1);
        windowContent.add(jLabel2);
        windowContent.add(result);
        windowContent.add(go);

        JFrame jFrame = new JFrame("My first calculator");
        jFrame.setContentPane(windowContent);

        jFrame.setSize(400, 100);
        jFrame.setVisible(true);

    }
}
