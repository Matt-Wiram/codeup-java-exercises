import javax.swing.*;
import java.awt.*;

public class GUI {

    static JPanel panel;
    static JFrame frame;

    public static void main(String[] args) {
        panel = new JPanel();
        frame = new JFrame("FrameDemo");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.pack();


        panel.setLayout(null);

        JLabel label = new JLabel("is cool");
        panel.add(label);

        label.setBounds(250, 250, 80, 25);
        JButton button = new JButton();
        button.setBounds(250, 200, 80, 25);
        button.setText("Click me");
        panel.add(button);

        frame.setVisible(true);
    }
}
