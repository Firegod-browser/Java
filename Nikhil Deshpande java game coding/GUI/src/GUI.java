import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI implements ActionListener {
    int count = 0;
    JLabel label;
    JFrame frame;
    JPanel panel;
    JButton button;

    public GUI() {

        frame = new JFrame();

        button = new JButton("click me");
        button.addActionListener(this);

        label = new JLabel("Number of times you clicked");

        panel = new JPanel();

        panel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

        panel.setLayout(new GridLayout());
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Set what happens when they close options\\
        frame.setTitle("GUI");
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new GUI(); // constructer method call.

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of times the button has been pressed          " + count);
    }
}
