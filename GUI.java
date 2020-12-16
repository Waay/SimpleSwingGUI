import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    private int clicks = 0;
    private JLabel label = new JLabel("Number of clicks:  0     ");
    private JFrame frame = new JFrame();

    public GUI() {

        // Button
        JButton btn = new JButton("Click");
        btn.addActionListener(this);

        // Panel with button and text
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout((new GridLayout(0, 1)));
        panel.add(btn);
        panel.add(label);

        // Frame and display
        frame.add(panel, BorderLayout.CENTER);

        // Specify operation of the close button
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set title to the window
        frame.setTitle("Simple GUI");

        // Sizes the frame so all the content is at or above preferred sizes
        frame.pack();
        frame.setVisible(true);

    }

    public void actionPerformed (ActionEvent e) {
        clicks++;
        label.setText("Number of clicks:    " + clicks);
    }
    public static void main(String[] args) {
        new GUI();
    }
}
